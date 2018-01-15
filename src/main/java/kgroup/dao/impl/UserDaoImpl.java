package kgroup.dao.impl;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import kgroup.dao.UserDao;
import kgroup.entity.User;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

import static com.mongodb.client.model.Filters.*;

@Repository("userDAO")
public class UserDaoImpl implements UserDao {

    private static MongoClient mongoClient;
    private static MongoDatabase database;
    private static MongoCollection<Document> collection;

    static {
        mongoClient = new MongoClient();
        database = mongoClient.getDatabase("myNewDatabase");
        collection = database.getCollection("user");
    }

    @Override
    public Collection<User> getAll() {
        FindIterable<Document> allUsers = collection.find();
        Collection<User> res = new ArrayList<User>();
        for (Document userDoc : allUsers) {
            String id = userDoc.get("_id").toString();
            String name = userDoc.getString("name");
            String gender = userDoc.getString("gender");
            String birthday = userDoc.getString("birthday");
            ArrayList<String> hobby = (ArrayList<String>) userDoc.get("hobby");
            String major = userDoc.getString("major");
            User user = new User(id, name, gender, birthday, hobby, major);
            res.add(user);
        }
        return res;
    }

    @Override
    public User getById(String id) {
        Document userDoc = collection.find(eq("_id", new ObjectId(id))).first();
        String name = userDoc.getString("name");
        String gender = userDoc.getString("gender");
        String birthday = userDoc.getString("birthday");
        ArrayList<String> hobby = (ArrayList<String>) userDoc.get("hobby");
        String major = userDoc.getString("major");
        User user = new User(id, name, gender, birthday, hobby, major);
        return user;
    }

    @Override
    public Collection<User> deleteById(String id) {
        collection.deleteOne(eq("_id", new ObjectId(id)));
        return getAll();
    }

    @Override
    public Collection<User> add(User user) {
        Document userDoc = new Document("name", user.getName())
                .append("gender", user.getGender())
                .append("birthday", user.getBirthday())
                .append("hobby", user.getHobby())
                .append("major", user.getMajor());
        collection.insertOne(userDoc);
        return getAll();
    }

    @Override
    public Collection<User> update(User user) {
        Document userDocNew = new Document("name", user.getName())
                .append("gender", user.getGender())
                .append("birthday", user.getBirthday())
                .append("hobby", user.getHobby())
                .append("major", user.getMajor());
        collection.findOneAndReplace(eq("_id",new ObjectId(user.getId())),userDocNew);
        return getAll();
    }

}

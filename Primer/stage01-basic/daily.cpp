#include <stdio.h>
int main()
{
	int a = 0, b = 0;
	int mod = 0, qu = 0;
	scanf_s("%d/%d", &a, &b);
	printf("0.");
	int i;
	for (i = 0; i < 200; i++)
	{
		qu = a * 10 / b;
		mod = a * 10 % b;
		if (mod != 0){
			printf("%d", qu);
			a = mod;
		}
		else{
			break;
		}
	}
	return 0;
	
}

/*
int i,sum=0;
for (i = 0; i < 3; i++){
sum += i;
printf("%d", sum);
}
int b = 9;
b = 4;
b = 10;
return 0;
-------------------
	Sales_item total;
	if (std::cin >> total){
	Sales_item trans;
	while (std::cin >> trans){
	if (total.isbn == trans.isbn)
	total += trans;
	else{
	std::cout << total << std::endl;
	total = trans;
	}
	}
	std::cout << total << std::endl;
	}
	else {
	std::cerr << "No data?!" << std::endl;
	return -1;
	}
	-------------
	Sales_item item1, item2;
	std::cin >> item1 >> item2;
	std::cout << item1 + item2 << std::endl;
	return 0;
	-------------
	Sales_item book;
	std::cin >> book;
	std::cout << book << std::endl;
	return 0;
	-------------
	int currVal = 0, val = 0;
	if (std::cin >> currVal){
	int cnt = 1;
	while (std::cin >> val){
	if (val == currVal)
	++cnt;
	else{
	std::cout << currVal << " occurs " << cnt << " times" << std::endl;
	currVal = val;
	cnt = 1;
	}
	}
	std::cout << currVal << " occurs " << cnt << " times " << std::endl;
	}
	return 0;
*/
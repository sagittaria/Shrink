#include <iostream>
#include "Sales_item.h"
int main()
{
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
	return 0;
}
	/*
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
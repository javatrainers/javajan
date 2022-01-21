
public class BankAccount {
	// variable = hold information
	// datatype  variableName=value
    int	accountNumber =1234; // declaration line
    float	balance=12.0f;
    double weight=12.0;
    String  name= "john";
    boolean  isSuspended=false;
    Address customerAddress=new Address();
    byte age=127;
    byte birthDate=25; // 1 and 31
    long birthMonth=10;
    short birthYear=2021; // 2021
    int zipcode=99999;
    long phoneNumber=9999999999l;
    
	/*
byte 1 byte in memory		-128 to 127
short 2 bytes in memory		-32768 to 32767
int  4 bytes in memory		-2billion to 2 billion
long  8 bytes in memory		trillions

4 byte	 float = 6 digit accuracy on decimal point
8 byte	 double = greater accuracy
	 
	 variable name rules
	 	any alphabet, any number, $, _
	 	it cannot start with a number
	 if variable name is multi word
	 account number, customer address
	 either use _ or camel case
	 upper case, lower case
	 account_number... accountNumber
	 */

}
/*
 green color code = Comments/Documentation
 
	single character 'a' ? char 
	group of character "john" ? String 
	number 1234 ? byte, short, int, long
	fraction number 12.3 ? float,double
	yes/no = true/false ? boolean
	complex ? CREATE ANOTHER PROGRAM
*/
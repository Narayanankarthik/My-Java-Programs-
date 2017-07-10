import java.io.*;
class emp
{
int empno,salary;
String ename,job;
public void assign(int tempno, String tename, String tjob,int tsalary)
{
empno=tempno;
ename=tename;
job=tjob;
salary=tsalary;
}
public void view()
{
System.out.println(“Employee Number : “ + empno);
System.out.println(“Employee Name : “ + ename);
System.out.println(“Job : “ + job);
System.out.println(“Salary : “ + salary);
}
}
class tata
{
public static void main(String arg[])
{
emp nancy = new emp();
emp john = new emp();
nancy.assign(101,”Nancy Jenifer”,”Analyst”,6000);
john.assign(102,”John Thomas”,”Programmer”,6000);
nancy.view();
john.view();
}
}
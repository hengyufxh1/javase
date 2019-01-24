package com.itstar.demo04;

/**
 * 测试student重写persoon类的方法
 * @author DXW
 *
 */
public class OverrideTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String name, int sex, char age, String stdNum, String classRoom, double grade
		// 会通过 super关键字 调用父类的构造函数
		Student student = new Student("张三",20,'男',"20181216","龙班",100.0);
		// student 类集成了我们person类的姓名 年龄 性别 
		// student 类重写了person的方法
		student.show();
		// 通过 super区分类 子类和父类的钱 并把父类的钱付给了子类。
		System.out.println("此时子类用的钱为="+student.money);
		// person 类原来的show方法
		Person person = new Person("张二",50,'女');
		person.show();
		
		
//		System.out.println("studnet集成了父类person父类"+student.money+"万元！");
//		Teacher teacher = new Teacher("刘老师",32,'男',"200000",20);
//		
//		teacher.show();
	}

}

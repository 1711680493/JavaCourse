public class Test {
	public static void main(String[] args) {
		// ��һ���� �ͽ�������
		Person p1 = new Person();
		p1.name = "����";
		p1.sex = "��";
		p1.age = 22;

		// �ڶ��� ����,ע��,��Ѷ����������
		Person p2 = new Person();
		p2.name = "����";
		p2.sex = "Ů";
		p2.age = 21;
		
		// ������ ������Ҫ�����������Ķ�ִ�����ϵĲ���
		System.out.println("�����ˣ�");
		operation(p1,0);
		operation(p2,0);
		// ����
		System.out.println("�����ˣ�");
		operation(p1,1);
		operation(p2,1);
		// ����
		System.out.println("�����ˣ�");
		operation(p1,2);
		operation(p2,2);
	}
	
	/**
	 * ִ�в���,����� person ���ݵ��� Person ��Ķ���.
	 * time ��Ϊ�ֱ���컹�����绹������.
	 * ���Ƕ��� time=0 ���ǰ���,=1��������,=2 ��������
	 * ��ΪҪ��main��ʹ��,������Ҫ���� static(��ʹ�����ǵ�ǰ��Ķ���)
	 */
	static void operation(Person person,int time) {
		// time ���ֱ������������
		if (0 == time) {
			// ����� person �Ǵ��ݽ�����,�����Ҵ��ݵ���p1,��ôperson����p1����
			// ���ϳԷ�
			person.eat();
		} else if (1 == time) {
			// ����Է�
			person.eat();
		} else if (2 == time) {
			// ���� �Է� ˯��
			person.eat();
			person.sleep();
		}
	}
}

class Person {
	// ����
	String name;
	// �Ա�
	String sex;
	// ����
	int age;
	// �Է� eat������˼�ǳԵ���˼.
	void eat() {
		// �Է����������Ǿ������ǰ�˵����� �Է�
		System.out.println(name + ": �Է���");
	}
	// ˯�� sleep��˯������˼
	void sleep() {
		System.out.println(name + ": ˯����");
	}
}
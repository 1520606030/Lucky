package lucky;

import java.util.Scanner;

public class Lucky {
	public static void main(String[] args) {
		String admin = null;
		int password = 0;
		int number = 0;
		int[] num = new int[5];
		
		Scanner input = new Scanner(System.in);
		System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
		System.out.print("\t1.ע��\r\n\t2.��¼\r\n\t3.�齱\r\n");
		System.out.println("***********************");
		System.out.print("��ѡ��˵���");
		int key = input.nextInt();
		switch (key) {
		case 1:
			System.out.println("[���͸���ϵͳ>ע��]");
			System.out.println("����д����ע����Ϣ");
			System.out.print("�û�����");
			admin = input.next();
			System.out.print("���룺");
			password = input.nextInt();
			
			System.out.println("ע��ɹ�����Ǻ����Ļ�Ա����");
			System.out.println("�û���\t����\t��Ա����\t");
			number = (int)(Math.random()*8999 + 1000);
			System.out.println(admin + "\t" + password + "\t" + number);
			System.out.print("������(y/n)��");
			String select1 = input.next();
			if(select1.equalsIgnoreCase("y")){
				System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
				System.out.print("\t1.ע��\r\n\t2.��¼\r\n\t3.�齱\r\n");
				System.out.println("***********************");
				System.out.print("��ѡ��˵���");
				int select101 = input.nextInt();
				if(select101 == 2);
			}
				else if(select1.equalsIgnoreCase("n")){
					System.out.println("ϵͳ�˳���ллʹ�ã�");
					break;
				}
		case 2:
			System.out.println("[���͸���ϵͳ>��¼]");
			System.out.print("�������û�����");
			String admin1 = input.next();
			System.out.print("���������룺");
			int password1 = input.nextInt();
			if(admin.equals(admin1) && password == password1){
				System.out.println("\r\n��ӭ����" + admin);
			}
			
			System.out.print("������(y/n)��");
			String select2 = input.next();
			if(select2.equalsIgnoreCase("y"))
				System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
				System.out.print("\t1.ע��\r\n\t2.��¼\r\n\t3.�齱\r\n");
				System.out.println("***********************");
				System.out.print("��ѡ��˵���");
				int select202 = input.nextInt();
				if(select202 == 3);
				else if(select2.equalsIgnoreCase("n")){
					System.out.println("ϵͳ�˳���ллʹ�ã�");
					break;
				}
		case 3:
			System.out.println("[���͸���ϵͳ>�齱]");
			System.out.println("���Ŀ��ţ�" + number);
			
			for (int i = 0; i < num.length; i++) {
				num[i] = (int)(Math.random()*8999 + 1000);
				for (int j = 0; j < i; j++) {
					if (num[i] == num[j]) {
						num[i] = (int)(Math.random()*8999 + 1000);
						j = -1;
					}
				}
			}
			System.out.print("���յ���������Ϊ��  ");
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + "  ");
			}
			
			int flag = 0;
			for (int i = 0; i < num.length; i++) {
				if (number == num[i]) {
					System.out.println("��ϲ����Ϊ���յ����˹˿ͣ�");
					flag++;
				}
			}
			if(flag == 0){
				System.out.println("\r\n��Ǹ�������ǽ��յ����˻�Ա��");
			}
			System.out.print("������(y/n)��");
			String select3 = input.next();
			if(select3.equalsIgnoreCase("y")){
				System.out.println("�齱������лл���룡");
				break;
			}
				else if(select3.equalsIgnoreCase("n")){
					System.out.println("ϵͳ�˳���ллʹ�ã�");
					break;
				}
		default:
			break;
		}
	}
}

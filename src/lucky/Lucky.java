package lucky;

import java.util.Scanner;

public class Lucky {
	public static void main(String[] args) {
		String admin = null;
		int password = 0;
		int number = 0;
		int[] num = new int[5];
		
		Scanner input = new Scanner(System.in);
		System.out.println("*****欢迎进入奖客富翁系统*****");
		System.out.print("\t1.注册\r\n\t2.登录\r\n\t3.抽奖\r\n");
		System.out.println("***********************");
		System.out.print("请选择菜单：");
		int key = input.nextInt();
		switch (key) {
		case 1:
			System.out.println("[奖客富翁系统>注册]");
			System.out.println("请填写个人注册信息");
			System.out.print("用户名：");
			admin = input.next();
			System.out.print("密码：");
			password = input.nextInt();
			
			System.out.println("注册成功，请记好您的会员卡号");
			System.out.println("用户名\t密码\t会员卡号\t");
			number = (int)(Math.random()*8999 + 1000);
			System.out.println(admin + "\t" + password + "\t" + number);
			System.out.print("继续吗？(y/n)：");
			String select1 = input.next();
			if(select1.equalsIgnoreCase("y")){
				System.out.println("*****欢迎进入奖客富翁系统*****");
				System.out.print("\t1.注册\r\n\t2.登录\r\n\t3.抽奖\r\n");
				System.out.println("***********************");
				System.out.print("请选择菜单：");
				int select101 = input.nextInt();
				if(select101 == 2);
			}
				else if(select1.equalsIgnoreCase("n")){
					System.out.println("系统退出，谢谢使用！");
					break;
				}
		case 2:
			System.out.println("[奖客富翁系统>登录]");
			System.out.print("请输入用户名：");
			String admin1 = input.next();
			System.out.print("请输入密码：");
			int password1 = input.nextInt();
			if(admin.equals(admin1) && password == password1){
				System.out.println("\r\n欢迎您：" + admin);
			}
			
			System.out.print("继续吗？(y/n)：");
			String select2 = input.next();
			if(select2.equalsIgnoreCase("y"))
				System.out.println("*****欢迎进入奖客富翁系统*****");
				System.out.print("\t1.注册\r\n\t2.登录\r\n\t3.抽奖\r\n");
				System.out.println("***********************");
				System.out.print("请选择菜单：");
				int select202 = input.nextInt();
				if(select202 == 3);
				else if(select2.equalsIgnoreCase("n")){
					System.out.println("系统退出，谢谢使用！");
					break;
				}
		case 3:
			System.out.println("[奖客富翁系统>抽奖]");
			System.out.println("您的卡号：" + number);
			
			for (int i = 0; i < num.length; i++) {
				num[i] = (int)(Math.random()*8999 + 1000);
				for (int j = 0; j < i; j++) {
					if (num[i] == num[j]) {
						num[i] = (int)(Math.random()*8999 + 1000);
						j = -1;
					}
				}
			}
			System.out.print("本日的幸运数字为：  ");
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + "  ");
			}
			
			int flag = 0;
			for (int i = 0; i < num.length; i++) {
				if (number == num[i]) {
					System.out.println("恭喜您成为本日的幸运顾客！");
					flag++;
				}
			}
			if(flag == 0){
				System.out.println("\r\n抱歉，您不是今日的幸运会员！");
			}
			System.out.print("继续吗？(y/n)：");
			String select3 = input.next();
			if(select3.equalsIgnoreCase("y")){
				System.out.println("抽奖结束，谢谢参与！");
				break;
			}
				else if(select3.equalsIgnoreCase("n")){
					System.out.println("系统退出，谢谢使用！");
					break;
				}
		default:
			break;
		}
	}
}

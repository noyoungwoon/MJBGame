import java.util.Scanner;

public class MJBGame {

	public static void main(String[] args) {
		//while������ ��� ��� ���Ŀ� �ٽ� �Է°����� �ǵ��ƿ��� ����
		boolean stop = false;
		while(!stop) {
			
		//����ڰ� Ű����� ���� �Է��ϱ� ���� Scanner ��ü ����
		Scanner s = new Scanner(System.in);	
		
		System.out.println("��/��/�� �߿� �ϳ��� �Է��ϼ���.");
		
		//player1���Լ� ��/��/�� �� �ϳ��� ���� �Է¹���
		System.out.println("player1 : ");
		String player1 = s.next();
		
		//player2���Լ� ��/��/�� �� �ϳ��� ���� �Է¹���
		System.out.println("player2 : ");
		String player2 = s.next();
		
		//player���� ��/��/�� ����� ���� if��
		//player1�� �Է��� ���� player2�� �Է��� ���� ��
		//if-else if�� �ȿ� if-else if��
		
			if(player1.equals("��")) {
				if(player2.equals("��")) {
					System.out.println("�����ϴ�.");
				}
				
				else if(player2.equals("��")) {
					System.out.println("player1�� �̰���ϴ�.");
				}
				
				else { 
					System.out.println("player1�� �����ϴ�.");
				}
				
				System.out.println("����Ͻðڽ��ϱ�? Y/N");
				String yn = s.next();
					if(yn.equals("Y") || yn.equals("y")) {
						continue;
					}
					
					if(yn.equals("N") || yn.equals("n")) {
						break;
					}
			}
			
			if(player1.equals("��")) {
				if(player2.equals("��")) {
					System.out.println("�����ϴ�.");
				}
				
				else if(player2.equals("��")) {
					System.out.println("player1�� �����ϴ�.");
				}
				
				else {
					System.out.println("player1�� �̰���ϴ�.");
				}
				
				System.out.println("����Ͻðڽ��ϱ�? Y/N");
				String yn = s.next();
					if(yn.equals("Y") || yn.equals("y")) {
						continue;
					}
					
					if(yn.equals("N") || yn.equals("n")) {
						break;
					}
			}
			
			if(player1.equals("��")) {
				if(player2.equals("��")) {
					System.out.println("player1�� �̰���ϴ�.");
				}
				
				else if(player2.equals("��")) {
					System.out.println("player1�� �̰���ϴ�.");
				}
				
				else {
					System.out.println("�����ϴ�.");
				}
				
				System.out.println("����Ͻðڽ��ϱ�? Y/N");
				String yn = s.next();
					if(yn.equals("Y") || yn.equals("y")) {
						continue;
					}
					
					if(yn.equals("N") || yn.equals("n")) {
						break;
					}
			}
		}//while end
	}//main end
}//class end
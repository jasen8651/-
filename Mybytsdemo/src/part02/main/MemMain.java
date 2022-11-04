package part02.main;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import part02.controller.MemController;
import part02.dto.MemDTO;


public class MemMain {

public static void main(String[] args) {
		
		MemController	mc = new MemController();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1번 리스트 | 2번 삽입 | 3번 수정 | 4번 삭제| 0번 종료 :");
			int input = Integer.parseInt(sc.nextLine());
			
			if(input==1) {
				listcall(mc);
			}else if (input ==2) {
				insercall(mc, sc );
				listcall(mc);
			}else if (input ==3) {
				updatecall(mc, sc);
				listcall(mc);
			}else if (input ==4) {
				deletecal(mc, sc);
				listcall(mc);
			}else if (input ==0) {
				System.out.println("시스템 종료");
				System.exit(input);
			}
		}
	}	
	private static void updatecall(MemController	mc, Scanner sc) {
		HashMap<String, Object> hmap = new HashMap<String, Object>();
		System.out.printf("번호입력 : ");
	
	 hmap.put("num", Integer.parseInt(sc.nextLine()));
	 
	 System.out.println("수정할 이름 임력 :");
	 hmap.put("name",sc.nextLine());
	 
	 int chk = mc.updateprocess(hmap);	
	 if(chk>=0)
			System.out.printf("%d개 수정\n",chk);
		else 
			System.out.println("실폐");
		}

	//삽입
	private static void insercall(MemController	mc, Scanner sc) {
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
	System.out.println("나이 입력");
		int age = Integer.parseInt(sc.nextLine());
	System.out.println("지역 입력");	
		String loc = sc.nextLine();
	MemDTO dto = new MemDTO(name, age, loc);
	int chk = mc.insertProcess(dto);
	if(chk>0)
		System.out.printf("%d개 삽입\n",chk);
	else 
		System.out.println("실폐");
	}
	//삭제
	private static void deletecal(MemController	mc, Scanner sc) {
		System.out.print("나이를 입력 :");
		int age = Integer.parseInt(sc.nextLine());
		int chk = mc.deletprocess(age);
		if(chk>0)
			System.out.printf("%d개 삭제\n",chk);
		else 
			System.out.println("실폐");
	}

	private static void listcall(MemController	mc) {
		List<MemDTO> alList = mc.listprocess();
		for(MemDTO dto : alList)
		System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
	}

}


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu[] menuList = new Menu[5];
        menuList[0] = new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거");
        menuList[1] = new Menu("Forzen Custard", "매장에서 신선하게 만드는 아이스크림");
        menuList[2] = new Menu("Drinks", "매장에서 직접 만드는 음료");
        menuList[3] = new Menu("Order ", "장바구니를 확인 후 주문합니다.");
        menuList[4] = new Menu("Cancel ", "진행중인 주문을 취소합니다.");

        Menu[] burgerList = new Menu[5];
        burgerList[0] = new Menu("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9);
        burgerList[1] = new Menu("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);
        burgerList[2] = new Menu("Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4);
        burgerList[3] = new Menu("Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9);
        burgerList[4] = new Menu("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4);

        Menu[] frozenCustardList = new Menu[4];
        frozenCustardList[0] = new Menu("Shake", "바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피", 5.9);
        frozenCustardList[1] = new Menu("Shake of the Week", "특별한 커스터드 플레이버", 6.5);
        frozenCustardList[2] = new Menu("Red bean shake", "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크", 6.5);
        frozenCustardList[3] = new Menu("Floats", "루트비어, 퍼플카우, 크림사클", 5.6);

        Menu[] drinksList = new Menu[4];
        drinksList[0] = new Menu("Shake-made-Lemonade", "매장에서 직접 만드는 상큼한 레몬에이드", 4.5);
        drinksList[1] = new Menu("Fresh Brewed Iced Tea", "직접 유기농 홍차를 우려낸 아이스티", 3.9);
        drinksList[2] = new Menu("Fifty/Fifty", "레몬에이드와 아이스티의 만남", 4.4);
        drinksList[3] = new Menu("Fountain Soda", "코카콜라, 코카콜라제로, 스프라이트", 3.3);


        ArrayList orderList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double total = 0.0;


        while (true) {

            System.out.println("쉑쉑 버거에 오신 것을 환영합니다");

            for (int i = 0; i < menuList.length; i++) {
                System.out.println(i + 1 + "." + menuList[i].getName() + "|" + menuList[i].getDesc());
            }
            System.out.println("메뉴를 보시고 번호를 입력해 주세요");

            int choiceNumber = sc.nextInt();

            if (choiceNumber == 1) {
                System.out.println("BurgerList");
                for (int i = 0; i < burgerList.length; i++) {
                    System.out.println(i + 1 + "." + burgerList[i].getName() + "[" + burgerList[i].getPrice() + "]" + burgerList[i].getDesc());
                }
                System.out.println("메뉴를 장바구니에 추가하시겠습니까");
                Scanner sc2 = new Scanner(System.in);
                int choice1 = sc2.nextInt() - 1;
                System.out.println(burgerList[choice1].getName() + "[" + burgerList[choice1].getPrice() + "]" + burgerList[choice1].getDesc());
                System.out.println("1.확인       2.취소");
                Scanner sc3 = new Scanner(System.in);
                int choice2 = sc3.nextInt();
                if (choice2 == 1) {
                    orderList.add(burgerList[choice1]);
                }


            } else if (choiceNumber == 2) {
                System.out.println("FrozenCustardList");
                for (int i = 0; i < frozenCustardList.length; i++) {
                    System.out.println(i + 1 + "." + frozenCustardList[i].getName() + "[" + frozenCustardList[i].getPrice() + "]" + frozenCustardList[i].getDesc());
                }
                System.out.println("메뉴를 장바구니에 추가하시겠습니까");
                Scanner sc2 = new Scanner(System.in);
                int choice1 = sc2.nextInt() - 1;
                System.out.println(frozenCustardList[choice1].getName() + "[" + frozenCustardList[choice1].getPrice() + "]" + frozenCustardList[choice1].getDesc());
                System.out.println("1.확인     2.취소");
                Scanner sc3 = new Scanner(System.in);
                int choice2 = sc3.nextInt();
                if (choice2 == 1) {
                    orderList.add(frozenCustardList[choice1]);
                }
            } else if (choiceNumber == 3) {
                System.out.println("DrinksList");
                for (int i = 0; i < drinksList.length; i++) {
                    System.out.println(i + 1 + "." + drinksList[i].getName() + "[" + drinksList[i].getPrice() + "]" + drinksList[i].getDesc());
                }
                System.out.println("메뉴를 장바구니에 추가하시겠습니까");
                Scanner sc2 = new Scanner(System.in);
                int choice1 = sc2.nextInt() - 1;
                System.out.println(drinksList[choice1].getName() + "[" + drinksList[choice1].getPrice() + "]" + drinksList[choice1].getDesc());
                System.out.println("1.확인     2.취소");
                Scanner sc3 = new Scanner(System.in);
                int choice2 = sc3.nextInt();
                if (choice2 == 1) {
                    orderList.add(drinksList[choice1]);
                }
            } else if (choiceNumber == 4) {
                System.out.println("주문");
                for (int i = 0; i < orderList.size(); i++) {
                    Menu orderOne = (Menu) orderList.get(i);
                    System.out.println(orderOne.getName() + " | " + orderOne.getPrice() + orderOne.getDesc());
                    total += orderOne.getPrice();
                }
                System.out.println("[ Total ]\n" + "W" + total);

                System.out.println("1.주문      2. 메뉴판");
                Scanner sc2 = new Scanner(System.in);
                int choice = sc2.nextInt();
                if (choice == 1) {
                    System.out.println("주문완료" + "대기번호는 [" + count + "]번 입니다");
                    orderList.clear();
                    count += 1;
                    total = 0;
                }
            } else if (choiceNumber == 5) {
                System.out.println("진행하던 주문을 취소하시겠습니까");
                System.out.println("1.확인      2.취소");
                System.out.println();
                Scanner sc2 = new Scanner(System.in);
                int choice = sc2.nextInt();

                if (choice == 1) {
                    orderList.clear();
                    total = 0;
                    System.out.println("주문취소");
                } else {
                    System.out.println("메인으로 돌아갑니다");
                }
            }

        }
    }
}


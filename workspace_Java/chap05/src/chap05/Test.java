package chap05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 0;
		String[] menu = { "아메리카노", "카페라떼", "카푸치노", "카페모카", "연유라떼", "허브티", "얼그레이티", "과일티", "아이스티", "와플", "샌드위치", "크로플",
				"쿠키" };
		int[] menuPrice = { 1500, 3500, 3500, 4000, 4000, 3000, 3000, 3000, 2500, 2500, 3500, 3500, 1500 };
		List order = new ArrayList();
		List orderPrices = new ArrayList();
		boolean run = true;

		// 매장, 포장 여부 선택
		while (true) {
			System.out.println("포장하시겠습니까?");
			System.out.println(" 1.매장  2.포장  3.종료");
			System.out.print("선택> ");
			int a = scan.nextInt();
			if (a == 1) {
				System.out.println("매장을 선택하셨습니다");
				break;
			} else if (a == 2) {
				System.out.println("포장을 선택하셨습니다");
				break;
			} else if (a == 3) {
				System.out.println("종료합니다");
				run = false;
				break;
			} else { // 잘못된 숫자를 입력했을 경우
				System.out.println("잘못된 번호를 입력하셨습니다");
				System.out.println("다시 선택해주세요");
			}
		}

		// 키오스크 작동
		loopbreak: while (run) {
			System.out.println("| 1.메뉴 | 2. 장바구니 | 3.결제 | ");
			System.out.print("선택> ");
			int a = scan.nextInt();
			// 메뉴선택 → 메뉴판출력
			if (a == 1) {
				// 메뉴판
				System.out.println("-----Coffee-------HOT----ICE--");
				System.out.println("1.  아메리카노    1,500 | 2,000");
				System.out.println("2.  카페라떼      3,500 | 4,000");
				System.out.println("3.  카푸치노      3,500 | 4,000");
				System.out.println("4.  카페모카      4,000 | 4,500");
				System.out.println("5.  연유라떼      4,000 | 4,500");

				System.out.println("-----Tea----------HOT----ICE--");
				System.out.println("6.  허브티        3,000 | 3,500");
				System.out.println("7.  얼그레이티    3,000 | 3,500");
				System.out.println("8.  과일티        3,000 | 3,500");
				System.out.println("9.  아이스티            | 2,500");

				System.out.println("---Desert---------------------");
				System.out.println("10. 와플               | 2,500");
				System.out.println("11. 샌드위치           | 3,500");
				System.out.println("12. 크로플             | 3,500");
				System.out.println("13. 쿠키               | 1,500");
				System.out.println("------------------------------");

				System.out.println("0.  돌아가기  14. 종료");

				System.out.println("구매하실 메뉴의 번호를 입력해주세요");
				System.out.print("선택> ");
				int b = scan.nextInt();
				// 얼음없는 메뉴 옵션
				if (b >= 9 && b <= 13) {
					System.out.println(menu[b - 1] + " 선택하셨습니다");
					System.out.println("몇 개를 주문하시겠습니까?");

					while (true) {
						System.out.println("수량을 입력해주세요(0. 처음으로, -1. 종료)");
						System.out.print("수량입력> ");
						int n = scan.nextInt();
						if (n > 0) {
							System.out.println(n + "개 주문하셨습니다");
							int orderPrice = menuPrice[b - 1] * n;
							total += orderPrice;
							System.out.printf("주문금액 : %d\n", orderPrice);
							order.add(menu[b - 1] + "\tDesert\t" + n + "개\t옵션없음\t" + orderPrice);
							orderPrices.add(orderPrice);
							break;
						} else if (n == 0) {
							System.out.println("처음으로 돌아갑니다");
							break;
						} else if (n == -1) {
							System.out.println("키오스크를 종료합니다");
							break loopbreak;

						} else {
							System.out.println("잘못된 숫자를 입력하셨습니다 다시 입력하세요");
						}
					}
					System.out.println("");

				} else if (b > 0 && b <= 8) {
					System.out.println("1. HOT | 2. ICE(+500)");
					System.out.print("선택> ");
					int c = scan.nextInt();
					if (c == 1) {
						System.out.println("옵션을 선택해주세요");
						System.out.println("1. 옵션없음 2. 샷추가(+500) 3. 휘핑크림 4. 연하게");
						System.out.print("선택> ");
						int option = scan.nextInt();
						while (true) {
							System.out.println("수량을 입력해주세요(0. 처음으로, -1. 종료)");
							System.out.print("수량입력> ");
							int n = scan.nextInt();
							if (n > 0) {
								System.out.println(n + "개 주문하셨습니다");
								int price = menuPrice[b - 1];
								String optionName = "옵션없음";
								if (option == 2) {
									price += 500;
									optionName = "샷추가";
								} else if (option == 3) {
									optionName = "휘핑크림 추가";
								} else if (option == 4) {
									optionName = "연하게";
								}
								int orderPrice = price * n;
								total += orderPrice;
								System.out.printf("주문금액 : %d\n", orderPrice);
								order.add(menu[b - 1] + "\tHOT\t" + n + "잔\t" + optionName + "\t" + orderPrice);
								orderPrices.add(orderPrice);
								break;
							} else if (n == 0) {
								System.out.println("처음으로 돌아갑니다");
								break;
							} else if (n == -1) {
								System.out.println("키오스크를 종료합니다");
								break loopbreak;

							} else {
								System.out.println("잘못된 숫자를 입력하셨습니다 다시 입력하세요");
							}
						}
					}

					else if (c == 2) {
						System.out.println("옵션을 선택해주세요");
						System.out.println("1. 옵션없음 2. 샷추가(+500) 3. 휘핑크림 4. 연하게");
						System.out.print("선택> ");
						int option = scan.nextInt();
						while (true) {
							System.out.println("수량을 입력해주세요(0. 처음으로, -1. 종료)");
							System.out.print("수량입력> ");
							int n = scan.nextInt();
							if (n > 0) {
								System.out.println(n + "개 주문하셨습니다");
								int price = menuPrice[b - 1] + 500;
								String optionName = "옵션없음";
								if (option == 2) {
									price += 500;
									optionName = "샷추가";
								} else if (option == 3) {
									optionName = "휘핑크림 추가";
								} else if (option == 4) {
									optionName = "연하게";
								}
								int orderPrice = price * n;
								total += orderPrice;
								System.out.printf("주문금액 : %d\n", orderPrice);
								order.add(menu[b - 1] + "\tICE\t" + n + "잔\t" + optionName + "\t" + orderPrice);
								orderPrices.add(orderPrice);
								break;
							} else if (n == 0) {
								System.out.println("처음으로 돌아갑니다");
								break;
							} else if (n == -1) {
								System.out.println("키오스크를 종료합니다");
								break loopbreak;

							} else {
								System.out.println("잘못된 숫자를 입력하셨습니다 다시 입력하세요");
							}
						}
					} else {
						System.out.println("잘못된 숫자를 입력하셨습니다 다시 입력하세요");
					}

				} else if (b == 0) {
					continue;
				} else {
					System.out.println("잘못된 번호를 입력하셨습니다 다시 입력해주세요");
				}

			} else if (a == 2) {
				// 아무런 메뉴를 선택하지 않아 금액이 0원일 경우
				if (total == 0) {
					System.out.println("아무런 메뉴를 선택하지 않았습니다");
					continue;
				}
				System.out.println("장바구니");
				for (int j = 0; j < order.size(); j++) {
					System.out.println((j + 1) + ". " + order.get(j));
				}
				System.out.println("총 금액 : " + total);
				while (true) {
					System.out.println("1. 메뉴제거 2. 돌아가기 3.종료");
					System.out.print("선택> ");
					int cart = scan.nextInt();

					if (cart == 1) {
						System.out.println("제거하실 번호를 입력해주세요(0. 돌아가기)");
						System.out.print("선택> ");
						int delete = scan.nextInt();
						if (delete > 0 && delete <= order.size()) {
							System.out.println(delete + "번째 항목을 삭제했습니다");
							total -= (int) orderPrices.get(delete - 1);
							order.remove(delete - 1);
							orderPrices.remove(delete - 1);
							break;
						} else if (delete == 0) {
							System.out.println("돌아갑니다");
							break;
						} else {
							System.out.println("잘못된 번호를 입력하셨습니다");
						}
					} else if (cart == 2) {
						break;
					} else if (cart == 3) {
						System.out.println("키오스크를 종료합니다");
					} else {
						System.out.println("잘못된 숫자를 입력하셨습니다 다시 입력하세요");
					}
				}

			} else if (a == 3) {
				// 아무런 메뉴를 선택하지 않아 금액이 0원일 경우
				if (total == 0) {
					System.out.println("아무런 메뉴를 선택하지 않았습니다");
					continue;
				}
				for (int j = 0; j < order.size(); j++) {
					System.out.println(order.get(j));
				}
				System.out.println("결제금액은 " + total + "원입니다.");
				System.out.println("결제하시겠습니까?");
				System.out.println("1. 결제 2. 돌아가기 3.종료");
				System.out.print("선택> ");
				int end = scan.nextInt();
				if (end == 1) {
					System.out.println("결제되셨습니다");
					System.out.println("프로그램을 종료합니다");
					break;
				} else if (end == 2) {
					continue;
				} else if (end == 3) {
					System.out.println("키오스크를 종료합니다");
					break loopbreak;
				} else {
					System.out.println("잘못된 숫자를 입력하셨습니다");
				}
			} else {
				System.out.println("잘못된 번호를 입력하셨습니다");
			}
		}

	}
}
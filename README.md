# ChessGame

## 요구사항 
1. 두 명의 플레이어가 체스를 둔다.
2. 8x8 말판을 사용한다.
3. King이 잡히면 게임이 종료된다.

## 설계

![image](https://user-images.githubusercontent.com/57928967/166102449-0263bbf2-98bb-4ffc-b4be-6d1a455d91ce.png)

* 위와 같이 크게 세 개의 객체를 이용한다.
* SOLID 원칙에 입각해 구현한다.

### 1. Single Responsibility Principle
* 위에 서술된 객체들은 단일 책임을 갖는다.

### 2. Open Closed Principle
* 체스말(Piece)을 구현할 때는 추상 클래스로 구현한다.
* 체스말 클래스를 상속 받아 King, Queen, Rock, Bishop, Knight, Pawn을 구현한다.
* 체스말이 이동 가능한 구역을 계산하는 메소드를 추상 메소드로 선언한다.

### 3. Liskov Substitution Principle
* 체스말 추상 클래스와 구체 클래스 간의 치환이 가능하도록 구현한다.

### 4. Interface Segregation Principle
* 체스말과 사용자 간의 인터페이스, 사용자와 말판 간의 인터페이스, 체스말과 말판 간의 인터페이스를 따로 분할하여 만든다.
* 체스말과 사용자 간의 인터페이스 : 체스말 조작(이동)
* 체스말과 말판 간의 인터페이스   : 체스말 이동 요청
* 사용자와 말판 간의 인터페이스   : 체스말 이동 결과 표시

### 5. Dependency Inversion Principle
* 체스말(Piece)을 구현할 때는 추상 클래스로 구현한다. (OCP와 동일)
* 사용자는 체스말의 추상 클래스를 이용하여 체스말을 조작한다.

package inflearn.lecture.factorymethod.before;

public class ShipFactory {

    public static Ship orderShip(String shipName, String email) {
        if (shipName == null | shipName.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }

        if (email == null | email.isEmpty()) {
            throw new IllegalArgumentException("이메일을 남겨주세요.");
        }

        prepareFor(shipName);

        Ship ship = new Ship();
        ship.setName(shipName);

        if(shipName.equalsIgnoreCase("WhiteShip")) {
            ship.setLogo("\uD83D\uDEE5");
        } else if (shipName.equalsIgnoreCase("BlackShip")) {
            ship.setLogo("⚓");
        }

        if(shipName.equalsIgnoreCase("WhiteShip")) {
            ship.setColor("white");
        } else if (shipName.equalsIgnoreCase("BlackShip")) {
            ship.setColor("black");
        }

        sendEmailTo(email, ship);

        return ship;
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(email + "님. 주문하신 " +ship.getName() + "다 만들었습니다.");
    }

    private static void prepareFor(String shipName) {
        System.out.println(shipName + "만들 준비 중");
    }
}

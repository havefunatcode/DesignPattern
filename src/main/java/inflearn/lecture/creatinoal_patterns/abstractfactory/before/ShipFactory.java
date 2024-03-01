package inflearn.lecture.creatinoal_patterns.abstractfactory.before;

import inflearn.lecture.creatinoal_patterns.abstractfactory.after.ship.Ship;

interface ShipFactory {
    default Ship orderShip(String shipName, String email) {
        validate(shipName, email);
        prepareFor(shipName);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    Ship createShip();

    private void validate(String shipName, String email) {
        if (shipName == null | shipName.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }

        if (email == null | email.isEmpty()) {
            throw new IllegalArgumentException("이메일을 남겨주세요.");
        }
    }

    private void prepareFor(String shipName) {
        System.out.println(shipName + " 만들 준비 중");
    }

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(email + "님. 주문하신 " +ship.getName() + " 다 만들었습니다.");
    }

}

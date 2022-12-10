package non_refactoring_ex;

/*
*      @Definition : 관람객이라는 개념을 구현한 클래스
* */
public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}

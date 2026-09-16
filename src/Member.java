public class Member {
    private int id;
    private String name;
    private int age;
    private Subscription subscription;

    public Member(int id, String name, int age, Subscription subscription) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subscription = subscription;
    }
    public  boolean enterGym(){
        if(subscription.getRemainingEntries()>=1){
            System.out.println("Entry approved");
            return true;
        }
        System.out.println("Entry denied");
        return false;
    }
    public boolean needsRenewal(){
        if(subscription.getRemainingEntries()<=2){
            return true;
        }
        else{
            return false;
        }
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", subscription=" + subscription +
                '}';
    }
}

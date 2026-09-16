public class Subscription {
    private String type;
    private int totalEntries;
    private int usedEntries;

    public Subscription(String type, int totalEntries) {
        this.type = type;
        this.totalEntries = totalEntries;
    }
    public boolean useEntry() {
        if(usedEntries<totalEntries){
             usedEntries++;
            return true;
        }
        return false;
    }
    public int getRemainingEntries() {

        return totalEntries-usedEntries;
    }

    public boolean isActive() {
        if(this.getRemainingEntries()>=1){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "type='" + type + '\'' +
                ", totalEntries=" + totalEntries +
                ", usedEntries=" + usedEntries +
                '}';
    }

}

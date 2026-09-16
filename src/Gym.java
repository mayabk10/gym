public class Gym {
    private String name;
    private Member[] members;
    private int memberCount;

    public Gym(String name,int maxMembers) {
        this.name = name;
        this.members = new Member[maxMembers];
        this.memberCount = 0;
    }
    public  boolean addMember(Member member) {
        if (memberCount >= members.length) {
            return false;
        }
        if (findMember(member.getId()) != null) {
            return false;
        }

        members[memberCount] = member;
        memberCount++;

        return true;
    }
    public Member findMember(int id) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getId() == id) {
                return members[i];
            }
        }

        return null;
    }
    public boolean registerEntry(int id) {
        Member member = findMember(id);

        if (member == null) {
            return false;
        }

        return member.enterGym();
    }

    public Member getMemberWithMostRemainingEntries() {
        if (memberCount == 0) {
            return null;
        }

        Member maxMember = members[0];

        for (int i = 1; i < memberCount; i++) {
            if (members[i].getSubscription().getRemainingEntries() >
                    maxMember.getSubscription().getRemainingEntries()) {

                maxMember = members[i];
            }
        }

        return maxMember;
    }

    public int countMembersWhoNeedRenewal() {
        int count = 0;

        for (int i = 0; i < memberCount; i++) {
            if (members[i].needsRenewal()) {
                count++;
            }
        }

        return count;
    }

    public void printActiveMembers() {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getSubscription().isActive()) {
                System.out.println(members[i]);
            }
        }
    }

    public Member[] getMembersWhoNeedRenewal() {
        int count = countMembersWhoNeedRenewal();

        Member[] result = new Member[count];

        int index = 0;

        for (int i = 0; i < memberCount; i++) {
            if (members[i].needsRenewal()) {
                result[index] = members[i];
                index++;
            }
        }

        return result;
    }

}

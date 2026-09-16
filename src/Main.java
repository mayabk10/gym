//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Gym with room for 5 members
        Gym gym = new Gym("Power Gym", 5);

        // 2. Four different subscriptions
        Subscription sub1 = new Subscription("Basic", 5);
        Subscription sub2 = new Subscription("Standard", 10);
        Subscription sub3 = new Subscription("Premium", 20);
        Subscription sub4 = new Subscription("Basic", 3);

        // 3. Four members
        Member m1 = new Member(101, "Dan", 20, sub1);
        Member m2 = new Member(102, "Noa", 22, sub2);
        Member m3 = new Member(103, "Yoni", 25, sub3);
        Member m4 = new Member(104, "Maya", 19, sub4);

        // 4. Add members
        System.out.println(gym.addMember(m1));
        System.out.println(gym.addMember(m2));
        System.out.println(gym.addMember(m3));
        System.out.println(gym.addMember(m4));

        // 5. Try to add an existing member again
        System.out.println("Adding existing member: " + gym.addMember(m1));

        // 6. Several gym entries
        gym.registerEntry(101);
        gym.registerEntry(101);
        gym.registerEntry(102);
        gym.registerEntry(103);
        gym.registerEntry(104);

        // 7. Try to enter with a member who doesn't exist
        System.out.println("Unregistered member entry: " + gym.registerEntry(999));

        // 8. Member with most remaining entries
        Member maxMember = gym.getMemberWithMostRemainingEntries();

        System.out.println("Member with most remaining entries:");
        System.out.println(maxMember);

        // 9. Number of members who need renewal
        System.out.println(
                "Members who need renewal: " +
                        gym.countMembersWhoNeedRenewal()
        );

        // 10. Print active members
        System.out.println("Active members:");
        gym.printActiveMembers();

        // Extra challenge
        System.out.println("Members who need renewal:");
        Member[] renewalMembers = gym.getMembersWhoNeedRenewal();

        for (int i = 0; i < renewalMembers.length; i++) {
            System.out.println(renewalMembers[i]);
        }
    }
}
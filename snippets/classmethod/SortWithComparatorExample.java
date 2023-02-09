package snippets.classmethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortWithComparatorExample {
    public static void main(String[] args) {
        ArrayList<Profile> profileList = new ArrayList<>();

        Profile profile1 = new Profile("Taro", 20, "baseball");
        profileList.add(profile1);

        Profile profile2 = new Profile("Hanako", 18, "soccer");
        profileList.add(profile2);

        Profile profile3 = new Profile("Jiro", 16, "game");
        profileList.add(profile3);

        System.out.println("*ソート前*");

        for (Profile profile : profileList) {
            System.out.println(profile.toString());
        }

        Collections.sort(profileList, new Comparator<Profile>(){
            public int compare(Profile p1, Profile p2) {
                return p1.getAge() - p2.getAge();
            }
        });

        System.out.println("*年齢順ソート*");

        for (Profile profile : profileList) {
            System.out.println(profile.toString());
        }

        Collections.sort(profileList, new Comparator<Profile>(){
            public int compare(Profile p1, Profile p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("*名前順ソート*");

        for (Profile profile : profileList) {
            System.out.println(profile.toString());
        }
    }

    public static class Profile {
        String name;
        int age;
        String hobby;

        public Profile(String name, int age, String hobby) {
            setName(name);
            setAge(age);
            setHobby(hobby);
        }

        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHobby() {
            return hobby;
        }

        public void setHobby(String hobby) {
            this.hobby = hobby;
        }

        @Override
        public String toString() {
            return "name=" + this.getName() + ", age=" + this.getAge() + ", hobby=" + this.getHobby();
        }
    }
}

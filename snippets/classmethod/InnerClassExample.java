package snippets.classmethod;

import java.util.Arrays;
import java.util.List;

public class InnerClassExample {
    public static void main(String[] args) {
        List<Profile> profileList = Arrays.asList(
            new Profile("taro", 20, "baseball"),
            new Profile("hanako", 18, "tennis"),
            new Profile("jiro", 16, "soccer")
        );
        profileList.stream().forEach(System.out::println);
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

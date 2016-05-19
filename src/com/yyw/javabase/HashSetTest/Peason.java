package com.yyw.javabase.HashSetTest;

/**
 * Created by wangshuai on 2016/5/19.
 */
public class Peason {
        private String name;
        private int age;

        public Peason(String name,int age){
            this.age = age;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Peason peason = (Peason) o;

            if (age != peason.age) return false;
            if (name != null ? !name.equals(peason.name) : peason.name != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + age;
            return result;
        }
}

package javabeakjoonquiz;

class Test {
   public long sum(int[] a) {
        long result = 0;
        for (int index = 0; index < a.length ; index++) {
            result += a[index];
        }
        return result;
    }
}

package com.capgemini.packg;

interface MyIterator {
    public boolean hasNext();
    public Object next();
}

interface Container {
    public MyIterator getIterator();
}

class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public MyIterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements MyIterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}

public class IteratorDesignPattern {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        MyIterator iter = namesRepository.getIterator();
        while( iter.hasNext()){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}

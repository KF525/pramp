package daily_problems;

class LLNode {
    int data;
    LLNode next;

    public void setNext(LLNode next) {
        this.next = next;
    }

    public LLNode(int data, LLNode next) {
        this.data = data;
        this.next = next;
    }

//    public LLNode(int data) {
//        new LLNode(data, null);
//    }
}

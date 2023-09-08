package ch15collection.text;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();

        for (Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }



        boolean contains = list.contains((new Board("제목1","글쓴이1")));
        System.out.println("contains = " + contains);
    }
}

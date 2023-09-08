package ch15collection.text;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<>();
        list.add(new Board("제목1","글쓴이1"));
        list.add(new Board("제목2","글쓴이2"));
        list.add(new Board("제목3","글쓴이3"));
        return list;


    }
}

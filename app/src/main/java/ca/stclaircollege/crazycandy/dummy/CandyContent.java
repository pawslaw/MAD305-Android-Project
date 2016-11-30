package ca.stclaircollege.crazycandy.dummy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by web on 16-11-30.
 */
public class CandyContent {
    //The class contains an array list that is capable of storing episode items
    //We declare it as public static so that both EpisodeListActivity and EpisodeDetailFragment can access it
    public static final List<CandyItem> ITEMS = new ArrayList<CandyItem>();

    //Populating static lists should be done inside of a static block
    //Static blocks are run when the class is loaded into the project
    //think of a static block as a construct for classes that don't create objects.
    static {
        ITEMS.add(new CandyItem("0", "S1E1 - Caretaker", "The crew begins their journey of the delta quadrant"));
        ITEMS.add(new CandyItem("1", "S1E2 - Caretaker", "The crew continues their journey of the delta quadrant"));
        ITEMS.add(new CandyItem("2", "S1E3 - Parallax", "Starfleet and the Maquis team up to get home"));
    }
    //We then declare an inner class named EpisodeItem
    //This class is used to represent all of our information inside of the list
    public static class CandyItem {
        private String id;
        private String name;
        private String detail;

        public CandyItem(String id, String name, String detail) {
            this.id = id;
            this.name = name;
            this.detail = detail;
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String content) {
            this.detail = content;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}

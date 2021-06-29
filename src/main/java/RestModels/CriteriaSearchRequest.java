package RestModels;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Data
public class CriteriaSearchRequest {

     private String categoryPart;
     private String subcategoryPart;
     private String namePart;
     private int levelPart;
     private int overAllScorePart;
     private String createdDate;


     public Date getCreatedDate() {
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
          try {
               return sdf.parse(createdDate);
          } catch (ParseException e) {
               return null;
          }

     }

}

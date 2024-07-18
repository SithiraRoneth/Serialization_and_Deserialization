/* Created By Sithira Roneth
 * Date :7/18/24
 * Time :13:04
 * Project Name :Serialization_and_Deserialization
 * */
package lk.ijse.serialization_and_deserialization.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookDto implements Serializable {
    private String name;
    private String author;
    private String genre;
    private String price;
}

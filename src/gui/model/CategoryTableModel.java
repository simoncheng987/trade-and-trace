package gui.model;
  
import java.util.List;
 
import javax.swing.table.AbstractTableModel;
 
import entity.Category;
import service.CategoryService;
  
public class CategoryTableModel extends AbstractTableModel {
  
    String[] columnNames = new String[] { "Category Names", "Times of costs"};
  
    // Use the list returned from service as the data of TableModel
  
    public List<Category> cs = new CategoryService().list();
  
     public int getRowCount() {
         
        return cs.size();
    }
  
    public int getColumnCount() {
         
        return columnNames.length;
    }
  
    public String getColumnName(int columnIndex) {
         
        return columnNames[columnIndex];
    }
  
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    // get the corresponding Category object through cs.get(rowIndex)
    // return wanted property by columnIndex
    public Object getValueAt(int rowIndex, int columnIndex) {
        Category h = cs.get(rowIndex);
        if (0 == columnIndex)
            return h.name;
        if (1 == columnIndex)
            return h.recordNumber;
 
        return null;
    }
  
}
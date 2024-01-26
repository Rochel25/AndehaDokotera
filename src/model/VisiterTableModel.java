package model;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class VisiterTableModel extends AbstractTableModel {
    private List<Object[]> data;
    private String[] columnNames = {"Idvisiter","Médecin", "Patient", "Date de visite"};

    public VisiterTableModel() {
        data = new ArrayList<>();
    }

    public void setData(List<Object[]> data) {
        this.data = data;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] row = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return row[0];
            case 1:
                return row[1]+" "+row[2];
            case 2:
                return row[3]+" "+row[4];
            case 3:
                return row[5];
            default:
                return null;
        }
    }
}

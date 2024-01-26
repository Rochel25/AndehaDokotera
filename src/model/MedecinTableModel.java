package model;
import entity.Medecin;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class MedecinTableModel extends AbstractTableModel {
    private List<Medecin> medecins;
    private String[] columnNames = {"Codemed", "Nom", "Prénoms", "Grade"};

    public MedecinTableModel(List<Medecin> medecins) {
        this.medecins = medecins;
    }

    @Override
    public int getRowCount() {
        return medecins.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Medecin medecin = medecins.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return medecin.getCodemed();
            case 1:
                return medecin.getNom();
            case 2:
                return medecin.getPrenom();
            case 3:
                return medecin.getGrade();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

   

    public void removeMedecin(int rowIndex) {
        medecins.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    // Méthode pour obtenir un médecin à l'index donné
    public Medecin getMedecin(int rowIndex) {
        return medecins.get(rowIndex);
    }
    
    
}

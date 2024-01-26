package model;
import entity.Patient;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PatientTableModel extends AbstractTableModel {
    private List<Patient> patients;
    private String[] columnNames = {"Codepat", "Nom", "Prénoms", "Sexe", "Grade"};

    public PatientTableModel(List<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public int getRowCount() {
        return patients.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Patient patient = patients.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return patient.getCodepat();
            case 1:
                return patient.getNom();
            case 2:
                return patient.getPrenom();
            case 3:
                return patient.getSexe();
            case 4:
                return patient.getAdresse();    
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

   

   
    
}

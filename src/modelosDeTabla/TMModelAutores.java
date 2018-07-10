/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosDeTabla;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import model.Autor;


/**
 *
 * @author Marce
 */
public class TMModelAutores implements TableModel {

    private List<Autor> autores;

    public TMModelAutores(List<Autor> autores) {
        this.autores = autores;
    }

    @Override
    public int getRowCount() {

        return autores.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Id";
            case 1:
                return "Nombre";
            case 2:
                return "Apellido";
            case 3:
                return "Rut";
            case 4:
                return "Nacionalidad";
            default:
                return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            default:
                return null;
        }

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Autor a= autores.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return a.getId();
            case 1:
                return a.getNombre();
            case 2:
                return a.getApellido();
            case 3:
                return a.getRut();
            case 4:
                return a.getNacionalidad();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        //
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        //
    }

}

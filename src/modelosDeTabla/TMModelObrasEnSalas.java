/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosDeTabla;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import model.Obra;

/**
 *
 * @author Marce
 */
public class TMModelObrasEnSalas implements TableModel {

    private List<Obra> obras;

    public TMModelObrasEnSalas(List<Obra> obras) {
        this.obras = obras;
    }

    @Override
    public int getRowCount() {

        return obras.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Id";
            case 1:
                return "Nombre";
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
        Obra o= obras.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return o.getId();
            case 1:
                return o.getNombreDeObra();
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


package Analyze;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class Result {
    private TableModel tableMode;

    public Result() {
        this.tableMode = new TableModel() {
            @Override
            public int getRowCount() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getColumnCount() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String getColumnName(int columnIndex) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void addTableModelListener(TableModelListener l) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void removeTableModelListener(TableModelListener l) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }

    public TableModel getTableMode() {
        return tableMode;
    }

    public void setTableMode(TableModel tableMode) {
        this.tableMode = tableMode;
    }
}

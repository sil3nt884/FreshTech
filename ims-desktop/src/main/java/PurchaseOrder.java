import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//import java.util.Vector;


import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;

import CustomUI.*;

/**
 * 
 * @author Thomas Dudley
 * 
 * This class will form the GUI for the Purchase Order page. 
 * The user will be able to select a product from the list,
 * select a supplier and and a quantity for the product.
 * These will then be added to the purchase order.
 *
 */

public class PurchaseOrder extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PurchaseOrder()
	{		
		this.setLayout(new BorderLayout());
		
		JPanel splitPanel = new JPanel();
	
		splitPanel.setLayout(new BoxLayout(splitPanel, BoxLayout.LINE_AXIS));
		splitPanel.add(createProductListPanel(), BorderLayout.WEST);
		
		JPanel northSouthPanel = new JPanel();
	
		northSouthPanel.setLayout(new BorderLayout());

		northSouthPanel.add(createPurchaseOrderInfoPanel(), BorderLayout.CENTER);
		northSouthPanel.add(createPurchaseOrderPanel(), BorderLayout.SOUTH);
		
		splitPanel.add(northSouthPanel, BorderLayout.SOUTH);
		
		splitPanel.setBackground(new Color(255, 255, 255));
		
		this.add(splitPanel);

	}
	public JComponent createProductListPanel()
	{
		Box productPanel = Box.createVerticalBox();
				
		CustomLabel title = new CustomLabel("Purchase Order", true);
		CustomLabel subTitle = new CustomLabel("Place a Purchase Order Here", true);
		CustomLabel instructionSet = new CustomLabel ("(1) Select a Product", false);
		
		String [] colNames = {"ProductID","Product Name","Quantity"};
		Object[][] data = new Object [35][5];
		JTable productTable = new JTable(data, colNames);
		
		JScrollPane scrollPane = new JScrollPane(productTable);		
		CustomButton placeOrder = new CustomButton("Place Order");
		
		
		JTableHeader header = productTable.getTableHeader();
	    header.setBackground(new Color(0,122,0));
	    header.setForeground(Color.WHITE);
	    productTable.setPreferredScrollableViewportSize(productTable.getPreferredSize());
		
		productPanel.setForeground(new Color(255, 255, 255));
		title.setFont(CustomFont.getFont("BOLD", 26));
		subTitle.setFont(CustomFont.getFont("ITALIC", 14));
		instructionSet.setFont(CustomFont.getFont("PLAIN", 14));
		scrollPane.setFont(CustomFont.getFont("PLAIN", 14));
		scrollPane.getViewport().setBackground(Color.WHITE);
		
		productTable.setFont(CustomFont.getFont("PLAIN", 14));
		
		productPanel.add(title);
		productPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		productPanel.add(subTitle);
		productPanel.add(Box.createRigidArea(new Dimension(0, 60)));
		productPanel.add(instructionSet);
		productPanel.add(scrollPane);
		productPanel.add(placeOrder);

		productPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
				
		return productPanel;
	}
	
	public JComponent createPurchaseOrderInfoPanel()
	{
		JPanel orderInfoPanel = new JPanel();
		GridLayout grid = new GridLayout(15, 1);
		
		String[] tempNames = new String[5];
		
		tempNames[0] = new String("Supplier One");
		tempNames[1] = new String("Supplier Two");
		tempNames[2] = new String("Supplier Three");
		tempNames[3] = new String("Supplier Four");
		tempNames[4] = new String("Supplier Five");
				
		String[] quantity = new String[10];
		
		for(int i = 1; i < 11; i++)
		{
			quantity[i - 1] = "" + i;
		}
		
		CustomLabel instruction = new CustomLabel("(2) Select Supplier", false);
		CustomLabel instructionTwo = new CustomLabel("(3) Select Quantity", false);
				
		JComboBox<String> listOfSuppliers = new JComboBox<String>(tempNames);
		JComboBox<String> quantityRequired = new JComboBox<String>(quantity);

		orderInfoPanel.setLayout(grid);
		orderInfoPanel.setBackground(new Color(255, 255, 255));		
		
		instruction.setFont(CustomFont.getFont("PLAIN", 14));
		instructionTwo.setFont(CustomFont.getFont("PLAIN", 14));
		listOfSuppliers.setFont(CustomFont.getFont("PLAIN", 14));
		quantityRequired.setFont(CustomFont.getFont("PLAIN", 14));
		
		listOfSuppliers.setForeground(new Color(0,122,0));
		quantityRequired.setForeground(new Color(0,122,0));
		
		grid.preferredLayoutSize(orderInfoPanel);
		
		orderInfoPanel.add(Box.createRigidArea(new Dimension(0, 300)));
		orderInfoPanel.add(Box.createRigidArea(new Dimension(0, 300)));
		orderInfoPanel.add(Box.createRigidArea(new Dimension(0, 300)));
		orderInfoPanel.add(Box.createRigidArea(new Dimension(0, 300)));
		orderInfoPanel.add(instruction);
		orderInfoPanel.add(Box.createRigidArea(new Dimension(0, 100)));
		listOfSuppliers.setPreferredSize(new Dimension(50, 30));
		orderInfoPanel.add(listOfSuppliers);
	
		orderInfoPanel.add(Box.createRigidArea(new Dimension(0, 100)));
		orderInfoPanel.add(instructionTwo);
		orderInfoPanel.add(quantityRequired);
		
		orderInfoPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		return orderInfoPanel;
	}	
	
	public JComponent createPurchaseOrderPanel()
	{
		JPanel purchaseOrderPanel = new JPanel();
		
		String [] colNames = {"Product ID", "Product Name", "Product Quantity", "Supplier"};
		Object[][] data = new Object[25][4];
		JTable purchaseOrderTable = new JTable(data, colNames);
		JScrollPane scrollPane = new JScrollPane(purchaseOrderTable);
		
		JTableHeader header = purchaseOrderTable.getTableHeader();
	    header.setBackground(new Color(0,122,0));
	    header.setForeground(Color.WHITE);
	    purchaseOrderTable.setPreferredScrollableViewportSize(purchaseOrderTable.getPreferredSize());
	    
	    purchaseOrderTable.getColumnModel().getColumn(1).setPreferredWidth(125);
	    purchaseOrderTable.getColumnModel().getColumn(2).setPreferredWidth(125);
	    
	    purchaseOrderTable.setPreferredSize(new Dimension(10000, 100));
	    
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		scrollPane.getViewport().setBackground(Color.WHITE);
		
		purchaseOrderPanel.add(scrollPane);
		purchaseOrderPanel.setBackground(new Color(255, 255, 255));
		
		purchaseOrderPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
		
		return purchaseOrderPanel;
	}
	
	public void addPurchaseOrder(CustomButton button, final JTable productTable, 
			final JComboBox<String> suppliers, final JComboBox<String> quant)
	{
		//final Vector<String> product = new Vector<String>();
		
		button.addMouseListener(new MouseListener()
		{

			@Override
			public void mouseClicked(MouseEvent e) 
			{
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) 
			{
				/*
				int productRow = productTable.getSelectedRow();
				int productCol = productTable.getSelectedColumn();
				
				//Object tempObj = productTable.getValueAt(productRow);
				//product.add((String) tempObj);
				
				String tempSupplier = (String) suppliers.getSelectedItem();
				String tempQuant = (String) quant.getSelectedItem();*/

			}
			

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
		});
	}
}

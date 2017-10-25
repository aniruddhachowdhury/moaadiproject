package com.cis.dao;
import java.util.List;
import com.cis.dao.model.Supplier;

public interface SupplierDAO {
	public Integer saveSupplier(Supplier supplier);
	public List<Supplier> getAllSupplier();
	public Supplier getSupplier(Integer supplier_ID);
	public void deleteSupplier(Integer supplier_ID);
	public void updateSupplier(Supplier supplier);

}

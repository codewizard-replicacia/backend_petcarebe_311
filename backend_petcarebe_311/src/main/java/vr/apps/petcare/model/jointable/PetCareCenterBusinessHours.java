package vr.apps.petcare.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import vr.apps.petcare.model.Pet;
import vr.apps.petcare.model.PetCareCenter;
import vr.apps.petcare.model.PetOwner;
import vr.apps.petcare.model.Document;
import vr.apps.petcare.model.PetService;
import vr.apps.petcare.enums.PetServiceType;
import vr.apps.petcare.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterBusinessHours")
@Table(schema = "\"petcare\"", name = "\"PetCareCenterBusinessHours\"")
@Data
public class PetCareCenterBusinessHours{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"BusinessHours\"")
    private Integer businessHours;
}
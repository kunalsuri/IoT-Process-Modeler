/**
 * IoT Physical Entity
 * 
 */

package de.hpi.bpmn2_0.model.participant;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

import de.hpi.bpmn2_0.model.BaseElement;
import de.hpi.bpmn2_0.model.FlowNode;
import de.hpi.bpmn2_0.model.Process;
import de.hpi.bpmn2_0.model.conversation.ConversationElement;
import de.hpi.bpmn2_0.model.participant.Participant;
import de.hpi.bpmn2_0.model.data_object.Message;

import de.hpi.bpmn2_0.transformation.Visitor;
import de.hpi.diagram.SignavioUUID;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name ="tPhysicalEntity")

public class PhysicalEntity
	extends Participant

{
	public PhysicalEntity() {
		super();
	}
	
	public PhysicalEntity(PhysicalEntity p){
		super(p);
		this.getInterfaceRef().addAll(p.getInterfaceRef());
		this.getEndPointRef().addAll(p.getEndPointRef());
		
		this.setParticipantMultiplicity(p.getParticipantMultiplicity());
		this.setProcessRef(p.getProcessRef());
		
		this.setPartnerRoleRef(p.getPartnerRoleRef());
		this.setPartnerEntityRef(p.getPartnerEntityRef());
		
		this.setInitiating(p.isInitiating());
		this.setLaneSet(p.getLaneSet());
		
		this._processType = p._processType;
		this._isClosed = p._isClosed;
		this._isExecutable = p._isExecutable;
		this._isChoreographyParticipant = p._isChoreographyParticipant;
	}
	
	public void acceptVisitor(Visitor v){
		v.visitPhysicalEntity(this);
	}
	
}

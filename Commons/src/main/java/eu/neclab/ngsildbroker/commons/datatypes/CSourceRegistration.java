package eu.neclab.ngsildbroker.commons.datatypes;

import java.net.URI;
import java.util.Date;
import java.util.List;
import com.github.filosganga.geogson.model.Geometry;

/**
 * @author hebgen
 * @version 1.0
 * @created 11-Jun-2018 11:13:22
 */
public class CSourceRegistration {

	private String description;
	private URI endpoint;
	private Long expiresAt;
	private URI id;

	private List<Information> information;
	//private GeoProperty location;
	private Geometry<?> location; // csource location is not the same as entity location. entity location is a GeoProperty, csource location is just a geojson value (string)
	private String registrationName;
	private TimeInterval timestamp;
	private boolean isInternal = false;

	/**
	 * a
	 */
	private String type = "CSourceRegistration";

	public CSourceRegistration() {

	}

	public void finalize() throws Throwable {

	}

	public CSourceRegistration update(CSourceRegistration updateBean) throws Exception {
		if (updateBean == null) {
			throw new Exception("null update payload.");
		}
		if (updateBean.getDescription() != null) {
			this.setDescription(updateBean.getDescription());
		}
		if (updateBean.getEndpoint() != null) {
			this.setEndpoint(updateBean.getEndpoint());
		}
		if (updateBean.getExpiresAt() != null) {
			this.setExpiresAt(updateBean.getExpiresAt());
		}
		if (updateBean.getId() != null) {
			this.setId(updateBean.getId());
		}
		if (updateBean.getInformation() != null) {
			// TODO : support for updating nested element i.e EntityInfo.
			// this.getInformation().addAll(updateBean.getInformation());
			this.setInformation(updateBean.getInformation());
		}
		if (updateBean.getLocation() != null) {
			this.setLocation(updateBean.getLocation());
		}
		if (updateBean.getRegistrationName() != null) {
			this.setRegistrationName(updateBean.getRegistrationName());
		}
		if (updateBean.getTimestamp() != null) {
			this.setTimestamp(updateBean.getTimestamp());
		}
		
		return this;
	}
	
	

	public boolean isInternal() {
		return isInternal;
	}

	public void setInternal(boolean isInternal) {
		this.isInternal = isInternal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public URI getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(URI endpoint) {
		this.endpoint = endpoint;
	}

	public Long getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(Long expiresAt) {
		this.expiresAt = expiresAt;
	}

	public URI getId() {
		return id;
	}

	public void setId(URI id) {
		this.id = id;
	}

	public List<Information> getInformation() {
		return information;
	}

	public void setInformation(List<Information> information) {
		this.information = information;
	}

	public Geometry<?> getLocation() {
		return location;
	}

	public void setLocation(Geometry<?> location) {
		this.location = location;
	}

	public String getRegistrationName() {
		return registrationName;
	}

	public void setRegistrationName(String registrationName) {
		this.registrationName = registrationName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public TimeInterval getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(TimeInterval timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "CSourceRegistration [description=" + description + ", endpoint=" + endpoint + ", expiresAt=" + expiresAt
				+ ", id=" + id + ", information=" + information + ", location=" + location + ", registrationName=" + registrationName
				+ ", timestamp=" + timestamp + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((endpoint == null) ? 0 : endpoint.hashCode());
		result = prime * result + ((expiresAt == null) ? 0 : expiresAt.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((information == null) ? 0 : information.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((registrationName == null) ? 0 : registrationName.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CSourceRegistration other = (CSourceRegistration) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (endpoint == null) {
			if (other.endpoint != null)
				return false;
		} else if (!endpoint.equals(other.endpoint))
			return false;
		if (expiresAt == null) {
			if (other.expiresAt != null)
				return false;
		} else if (!expiresAt.equals(other.expiresAt))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (information == null) {
			if (other.information != null)
				return false;
		} else if (!information.equals(other.information))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (registrationName == null) {
			if (other.registrationName != null)
				return false;
		} else if (!registrationName.equals(other.registrationName))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}

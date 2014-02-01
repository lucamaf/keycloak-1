package org.keycloak.representations.idm;

import java.util.List;
import java.util.Set;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class RoleRepresentation {
    protected String id;
    protected String name;
    protected String description;
    protected boolean composite;
    protected List<RoleRepresentation> composites;

    public RoleRepresentation() {
    }

    public RoleRepresentation(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComposite() {
        return composite;
    }

    public void setComposite(boolean composite) {
        this.composite = composite;
    }

    public List<RoleRepresentation> getComposites() {
        return composites;
    }

    public void setComposites(List<RoleRepresentation> composites) {
        this.composites = composites;
    }
}

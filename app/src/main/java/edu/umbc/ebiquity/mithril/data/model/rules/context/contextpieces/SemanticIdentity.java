package edu.umbc.ebiquity.mithril.data.model.rules.context.contextpieces;

import edu.umbc.ebiquity.mithril.MithrilApplication;

public class SemanticIdentity {
    private String identity;

    public SemanticIdentity() {
        identity = MithrilApplication.getContextDefaultIdentity();
    }

    public SemanticIdentity(String anIdentity) {
        identity = anIdentity;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof SemanticIdentity)) {
            return false;
        }
        SemanticIdentity other = (SemanticIdentity) obj;
        if (identity == null) {
            if (other.identity != null) {
                return false;
            }
        } else if (!identity.equals(other.identity)) {
            return false;
        }
        return true;
    }

    /**
     * @return the identity
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * @param identity the identity to set
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((identity == null) ? 0 : identity.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return identity;
    }
}
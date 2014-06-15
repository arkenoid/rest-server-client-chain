package id.go.djp.cm.bridge.sidjp.model;

import java.math.BigDecimal;

public class MasterJenisPemeriksaan {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MASTER_JENIS_PEMERIKSAAN.ID
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MASTER_JENIS_PEMERIKSAAN.VERSION
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    private BigDecimal version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MASTER_JENIS_PEMERIKSAAN.IS_ACTIVE
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    private Short isActive;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MASTER_JENIS_PEMERIKSAAN.KODE_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    private BigDecimal kodeJenisPemeriksaan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MASTER_JENIS_PEMERIKSAAN.NAMA_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    private String namaJenisPemeriksaan;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MASTER_JENIS_PEMERIKSAAN.ID
     *
     * @return the value of MASTER_JENIS_PEMERIKSAAN.ID
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MASTER_JENIS_PEMERIKSAAN.ID
     *
     * @param id the value for MASTER_JENIS_PEMERIKSAAN.ID
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MASTER_JENIS_PEMERIKSAAN.VERSION
     *
     * @return the value of MASTER_JENIS_PEMERIKSAAN.VERSION
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MASTER_JENIS_PEMERIKSAAN.VERSION
     *
     * @param version the value for MASTER_JENIS_PEMERIKSAAN.VERSION
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MASTER_JENIS_PEMERIKSAAN.IS_ACTIVE
     *
     * @return the value of MASTER_JENIS_PEMERIKSAAN.IS_ACTIVE
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    public Short getIsActive() {
        return isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MASTER_JENIS_PEMERIKSAAN.IS_ACTIVE
     *
     * @param isActive the value for MASTER_JENIS_PEMERIKSAAN.IS_ACTIVE
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MASTER_JENIS_PEMERIKSAAN.KODE_JENIS_PEMERIKSAAN
     *
     * @return the value of MASTER_JENIS_PEMERIKSAAN.KODE_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    public BigDecimal getKodeJenisPemeriksaan() {
        return kodeJenisPemeriksaan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MASTER_JENIS_PEMERIKSAAN.KODE_JENIS_PEMERIKSAAN
     *
     * @param kodeJenisPemeriksaan the value for MASTER_JENIS_PEMERIKSAAN.KODE_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    public void setKodeJenisPemeriksaan(BigDecimal kodeJenisPemeriksaan) {
        this.kodeJenisPemeriksaan = kodeJenisPemeriksaan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MASTER_JENIS_PEMERIKSAAN.NAMA_JENIS_PEMERIKSAAN
     *
     * @return the value of MASTER_JENIS_PEMERIKSAAN.NAMA_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    public String getNamaJenisPemeriksaan() {
        return namaJenisPemeriksaan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MASTER_JENIS_PEMERIKSAAN.NAMA_JENIS_PEMERIKSAAN
     *
     * @param namaJenisPemeriksaan the value for MASTER_JENIS_PEMERIKSAAN.NAMA_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    public void setNamaJenisPemeriksaan(String namaJenisPemeriksaan) {
        this.namaJenisPemeriksaan = namaJenisPemeriksaan == null ? null : namaJenisPemeriksaan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MasterJenisPemeriksaan other = (MasterJenisPemeriksaan) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getIsActive() == null ? other.getIsActive() == null : this.getIsActive().equals(other.getIsActive()))
            && (this.getKodeJenisPemeriksaan() == null ? other.getKodeJenisPemeriksaan() == null : this.getKodeJenisPemeriksaan().equals(other.getKodeJenisPemeriksaan()))
            && (this.getNamaJenisPemeriksaan() == null ? other.getNamaJenisPemeriksaan() == null : this.getNamaJenisPemeriksaan().equals(other.getNamaJenisPemeriksaan()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        result = prime * result + ((getKodeJenisPemeriksaan() == null) ? 0 : getKodeJenisPemeriksaan().hashCode());
        result = prime * result + ((getNamaJenisPemeriksaan() == null) ? 0 : getNamaJenisPemeriksaan().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", version=").append(version);
        sb.append(", isActive=").append(isActive);
        sb.append(", kodeJenisPemeriksaan=").append(kodeJenisPemeriksaan);
        sb.append(", namaJenisPemeriksaan=").append(namaJenisPemeriksaan);
        sb.append("]");
        return sb.toString();
    }
}
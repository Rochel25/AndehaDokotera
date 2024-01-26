package entity;
// Generated 19 mai 2023 23:10:05 by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="visiter"
    ,schema="gestionmed"
)

public class Visiter implements Serializable  {
    


    public Visiter() {
    }
    
    
    
    
    
    
    private int idvisiter;
    private Medecin medecin;
    private Patient patient;
    private Date date;

    public Visiter(Integer id, Medecin med, Patient pat, Date date) {
       this.idvisiter = id;
       this.medecin = med;
       this.patient = pat;
       this.date = date;
    }
    

    @ManyToOne
    @JoinColumn(name = "codemed")
    public Medecin getMedecin() {
        return this.medecin;
    }
    
   public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
   
   
     
   @ManyToOne
   @JoinColumn(name = "codepat")
   public Patient getPatient() {
        return this.patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    
    }
    
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idvisiter", unique=true, nullable=false)
    public int getIdvisiter() {
        return this.idvisiter;
    }
    
    public void setIdvisiter(int idvisiter) {
        this.idvisiter = idvisiter;
    }

    
 ////private int codemed;

////@Column(name="codemed", nullable=false)
    //public int getCodemed() {
        //return this.codemed;
   // }
    
    ////public void setCodemed(int codemed) {
        //this.codemed = codemed;
    //}

    
 //private Integer codepat;

//@Column(name="codepat")
  //  public Integer getCodepat() {
        //return this.codepat;
    ////}
    
    //public void setCodepat(Integer codepat) {
       //this.codepat = codepat;
    //}

   

    @Temporal(TemporalType.DATE)
    @Column(name="date", length=13)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    

     

  


}



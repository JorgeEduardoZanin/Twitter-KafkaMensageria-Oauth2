/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package project.spring.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class NotificacaoPagamento extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7128973641839250560L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NotificacaoPagamento\",\"namespace\":\"project.spring.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"usuarioId\",\"type\":\"string\"},{\"name\":\"paymentId\",\"type\":\"string\"},{\"name\":\"billingType\",\"type\":\"string\"},{\"name\":\"chavePix\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"dataExpiracaoAssinatura\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"dataExpiracaoPagamento\",\"type\":\"string\"},{\"name\":\"status\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<NotificacaoPagamento> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<NotificacaoPagamento> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<NotificacaoPagamento> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<NotificacaoPagamento> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<NotificacaoPagamento> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this NotificacaoPagamento to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a NotificacaoPagamento from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a NotificacaoPagamento instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static NotificacaoPagamento fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private long id;
  private java.lang.CharSequence usuarioId;
  private java.lang.CharSequence paymentId;
  private java.lang.CharSequence billingType;
  private java.lang.CharSequence chavePix;
  private java.lang.CharSequence dataExpiracaoAssinatura;
  private java.lang.CharSequence dataExpiracaoPagamento;
  private java.lang.CharSequence status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public NotificacaoPagamento() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param usuarioId The new value for usuarioId
   * @param paymentId The new value for paymentId
   * @param billingType The new value for billingType
   * @param chavePix The new value for chavePix
   * @param dataExpiracaoAssinatura The new value for dataExpiracaoAssinatura
   * @param dataExpiracaoPagamento The new value for dataExpiracaoPagamento
   * @param status The new value for status
   */
  public NotificacaoPagamento(java.lang.Long id, java.lang.CharSequence usuarioId, java.lang.CharSequence paymentId, java.lang.CharSequence billingType, java.lang.CharSequence chavePix, java.lang.CharSequence dataExpiracaoAssinatura, java.lang.CharSequence dataExpiracaoPagamento, java.lang.CharSequence status) {
    this.id = id;
    this.usuarioId = usuarioId;
    this.paymentId = paymentId;
    this.billingType = billingType;
    this.chavePix = chavePix;
    this.dataExpiracaoAssinatura = dataExpiracaoAssinatura;
    this.dataExpiracaoPagamento = dataExpiracaoPagamento;
    this.status = status;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return usuarioId;
    case 2: return paymentId;
    case 3: return billingType;
    case 4: return chavePix;
    case 5: return dataExpiracaoAssinatura;
    case 6: return dataExpiracaoPagamento;
    case 7: return status;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: usuarioId = (java.lang.CharSequence)value$; break;
    case 2: paymentId = (java.lang.CharSequence)value$; break;
    case 3: billingType = (java.lang.CharSequence)value$; break;
    case 4: chavePix = (java.lang.CharSequence)value$; break;
    case 5: dataExpiracaoAssinatura = (java.lang.CharSequence)value$; break;
    case 6: dataExpiracaoPagamento = (java.lang.CharSequence)value$; break;
    case 7: status = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'usuarioId' field.
   * @return The value of the 'usuarioId' field.
   */
  public java.lang.CharSequence getUsuarioId() {
    return usuarioId;
  }


  /**
   * Sets the value of the 'usuarioId' field.
   * @param value the value to set.
   */
  public void setUsuarioId(java.lang.CharSequence value) {
    this.usuarioId = value;
  }

  /**
   * Gets the value of the 'paymentId' field.
   * @return The value of the 'paymentId' field.
   */
  public java.lang.CharSequence getPaymentId() {
    return paymentId;
  }


  /**
   * Sets the value of the 'paymentId' field.
   * @param value the value to set.
   */
  public void setPaymentId(java.lang.CharSequence value) {
    this.paymentId = value;
  }

  /**
   * Gets the value of the 'billingType' field.
   * @return The value of the 'billingType' field.
   */
  public java.lang.CharSequence getBillingType() {
    return billingType;
  }


  /**
   * Sets the value of the 'billingType' field.
   * @param value the value to set.
   */
  public void setBillingType(java.lang.CharSequence value) {
    this.billingType = value;
  }

  /**
   * Gets the value of the 'chavePix' field.
   * @return The value of the 'chavePix' field.
   */
  public java.lang.CharSequence getChavePix() {
    return chavePix;
  }


  /**
   * Sets the value of the 'chavePix' field.
   * @param value the value to set.
   */
  public void setChavePix(java.lang.CharSequence value) {
    this.chavePix = value;
  }

  /**
   * Gets the value of the 'dataExpiracaoAssinatura' field.
   * @return The value of the 'dataExpiracaoAssinatura' field.
   */
  public java.lang.CharSequence getDataExpiracaoAssinatura() {
    return dataExpiracaoAssinatura;
  }


  /**
   * Sets the value of the 'dataExpiracaoAssinatura' field.
   * @param value the value to set.
   */
  public void setDataExpiracaoAssinatura(java.lang.CharSequence value) {
    this.dataExpiracaoAssinatura = value;
  }

  /**
   * Gets the value of the 'dataExpiracaoPagamento' field.
   * @return The value of the 'dataExpiracaoPagamento' field.
   */
  public java.lang.CharSequence getDataExpiracaoPagamento() {
    return dataExpiracaoPagamento;
  }


  /**
   * Sets the value of the 'dataExpiracaoPagamento' field.
   * @param value the value to set.
   */
  public void setDataExpiracaoPagamento(java.lang.CharSequence value) {
    this.dataExpiracaoPagamento = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.CharSequence getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.CharSequence value) {
    this.status = value;
  }

  /**
   * Creates a new NotificacaoPagamento RecordBuilder.
   * @return A new NotificacaoPagamento RecordBuilder
   */
  public static project.spring.avro.NotificacaoPagamento.Builder newBuilder() {
    return new project.spring.avro.NotificacaoPagamento.Builder();
  }

  /**
   * Creates a new NotificacaoPagamento RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new NotificacaoPagamento RecordBuilder
   */
  public static project.spring.avro.NotificacaoPagamento.Builder newBuilder(project.spring.avro.NotificacaoPagamento.Builder other) {
    if (other == null) {
      return new project.spring.avro.NotificacaoPagamento.Builder();
    } else {
      return new project.spring.avro.NotificacaoPagamento.Builder(other);
    }
  }

  /**
   * Creates a new NotificacaoPagamento RecordBuilder by copying an existing NotificacaoPagamento instance.
   * @param other The existing instance to copy.
   * @return A new NotificacaoPagamento RecordBuilder
   */
  public static project.spring.avro.NotificacaoPagamento.Builder newBuilder(project.spring.avro.NotificacaoPagamento other) {
    if (other == null) {
      return new project.spring.avro.NotificacaoPagamento.Builder();
    } else {
      return new project.spring.avro.NotificacaoPagamento.Builder(other);
    }
  }

  /**
   * RecordBuilder for NotificacaoPagamento instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NotificacaoPagamento>
    implements org.apache.avro.data.RecordBuilder<NotificacaoPagamento> {

    private long id;
    private java.lang.CharSequence usuarioId;
    private java.lang.CharSequence paymentId;
    private java.lang.CharSequence billingType;
    private java.lang.CharSequence chavePix;
    private java.lang.CharSequence dataExpiracaoAssinatura;
    private java.lang.CharSequence dataExpiracaoPagamento;
    private java.lang.CharSequence status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(project.spring.avro.NotificacaoPagamento.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.usuarioId)) {
        this.usuarioId = data().deepCopy(fields()[1].schema(), other.usuarioId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.paymentId)) {
        this.paymentId = data().deepCopy(fields()[2].schema(), other.paymentId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.billingType)) {
        this.billingType = data().deepCopy(fields()[3].schema(), other.billingType);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.chavePix)) {
        this.chavePix = data().deepCopy(fields()[4].schema(), other.chavePix);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.dataExpiracaoAssinatura)) {
        this.dataExpiracaoAssinatura = data().deepCopy(fields()[5].schema(), other.dataExpiracaoAssinatura);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.dataExpiracaoPagamento)) {
        this.dataExpiracaoPagamento = data().deepCopy(fields()[6].schema(), other.dataExpiracaoPagamento);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.status)) {
        this.status = data().deepCopy(fields()[7].schema(), other.status);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
    }

    /**
     * Creates a Builder by copying an existing NotificacaoPagamento instance
     * @param other The existing instance to copy.
     */
    private Builder(project.spring.avro.NotificacaoPagamento other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.usuarioId)) {
        this.usuarioId = data().deepCopy(fields()[1].schema(), other.usuarioId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.paymentId)) {
        this.paymentId = data().deepCopy(fields()[2].schema(), other.paymentId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.billingType)) {
        this.billingType = data().deepCopy(fields()[3].schema(), other.billingType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.chavePix)) {
        this.chavePix = data().deepCopy(fields()[4].schema(), other.chavePix);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.dataExpiracaoAssinatura)) {
        this.dataExpiracaoAssinatura = data().deepCopy(fields()[5].schema(), other.dataExpiracaoAssinatura);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.dataExpiracaoPagamento)) {
        this.dataExpiracaoPagamento = data().deepCopy(fields()[6].schema(), other.dataExpiracaoPagamento);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.status)) {
        this.status = data().deepCopy(fields()[7].schema(), other.status);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'usuarioId' field.
      * @return The value.
      */
    public java.lang.CharSequence getUsuarioId() {
      return usuarioId;
    }


    /**
      * Sets the value of the 'usuarioId' field.
      * @param value The value of 'usuarioId'.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder setUsuarioId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.usuarioId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'usuarioId' field has been set.
      * @return True if the 'usuarioId' field has been set, false otherwise.
      */
    public boolean hasUsuarioId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'usuarioId' field.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder clearUsuarioId() {
      usuarioId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'paymentId' field.
      * @return The value.
      */
    public java.lang.CharSequence getPaymentId() {
      return paymentId;
    }


    /**
      * Sets the value of the 'paymentId' field.
      * @param value The value of 'paymentId'.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder setPaymentId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.paymentId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'paymentId' field has been set.
      * @return True if the 'paymentId' field has been set, false otherwise.
      */
    public boolean hasPaymentId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'paymentId' field.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder clearPaymentId() {
      paymentId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'billingType' field.
      * @return The value.
      */
    public java.lang.CharSequence getBillingType() {
      return billingType;
    }


    /**
      * Sets the value of the 'billingType' field.
      * @param value The value of 'billingType'.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder setBillingType(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.billingType = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'billingType' field has been set.
      * @return True if the 'billingType' field has been set, false otherwise.
      */
    public boolean hasBillingType() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'billingType' field.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder clearBillingType() {
      billingType = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'chavePix' field.
      * @return The value.
      */
    public java.lang.CharSequence getChavePix() {
      return chavePix;
    }


    /**
      * Sets the value of the 'chavePix' field.
      * @param value The value of 'chavePix'.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder setChavePix(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.chavePix = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'chavePix' field has been set.
      * @return True if the 'chavePix' field has been set, false otherwise.
      */
    public boolean hasChavePix() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'chavePix' field.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder clearChavePix() {
      chavePix = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'dataExpiracaoAssinatura' field.
      * @return The value.
      */
    public java.lang.CharSequence getDataExpiracaoAssinatura() {
      return dataExpiracaoAssinatura;
    }


    /**
      * Sets the value of the 'dataExpiracaoAssinatura' field.
      * @param value The value of 'dataExpiracaoAssinatura'.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder setDataExpiracaoAssinatura(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.dataExpiracaoAssinatura = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'dataExpiracaoAssinatura' field has been set.
      * @return True if the 'dataExpiracaoAssinatura' field has been set, false otherwise.
      */
    public boolean hasDataExpiracaoAssinatura() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'dataExpiracaoAssinatura' field.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder clearDataExpiracaoAssinatura() {
      dataExpiracaoAssinatura = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'dataExpiracaoPagamento' field.
      * @return The value.
      */
    public java.lang.CharSequence getDataExpiracaoPagamento() {
      return dataExpiracaoPagamento;
    }


    /**
      * Sets the value of the 'dataExpiracaoPagamento' field.
      * @param value The value of 'dataExpiracaoPagamento'.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder setDataExpiracaoPagamento(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.dataExpiracaoPagamento = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'dataExpiracaoPagamento' field has been set.
      * @return True if the 'dataExpiracaoPagamento' field has been set, false otherwise.
      */
    public boolean hasDataExpiracaoPagamento() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'dataExpiracaoPagamento' field.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder clearDataExpiracaoPagamento() {
      dataExpiracaoPagamento = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.CharSequence getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.status = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public project.spring.avro.NotificacaoPagamento.Builder clearStatus() {
      status = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public NotificacaoPagamento build() {
      try {
        NotificacaoPagamento record = new NotificacaoPagamento();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.usuarioId = fieldSetFlags()[1] ? this.usuarioId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.paymentId = fieldSetFlags()[2] ? this.paymentId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.billingType = fieldSetFlags()[3] ? this.billingType : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.chavePix = fieldSetFlags()[4] ? this.chavePix : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.dataExpiracaoAssinatura = fieldSetFlags()[5] ? this.dataExpiracaoAssinatura : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.dataExpiracaoPagamento = fieldSetFlags()[6] ? this.dataExpiracaoPagamento : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.status = fieldSetFlags()[7] ? this.status : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<NotificacaoPagamento>
    WRITER$ = (org.apache.avro.io.DatumWriter<NotificacaoPagamento>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<NotificacaoPagamento>
    READER$ = (org.apache.avro.io.DatumReader<NotificacaoPagamento>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.id);

    out.writeString(this.usuarioId);

    out.writeString(this.paymentId);

    out.writeString(this.billingType);

    if (this.chavePix == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.chavePix);
    }

    if (this.dataExpiracaoAssinatura == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.dataExpiracaoAssinatura);
    }

    out.writeString(this.dataExpiracaoPagamento);

    out.writeString(this.status);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readLong();

      this.usuarioId = in.readString(this.usuarioId instanceof Utf8 ? (Utf8)this.usuarioId : null);

      this.paymentId = in.readString(this.paymentId instanceof Utf8 ? (Utf8)this.paymentId : null);

      this.billingType = in.readString(this.billingType instanceof Utf8 ? (Utf8)this.billingType : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.chavePix = null;
      } else {
        this.chavePix = in.readString(this.chavePix instanceof Utf8 ? (Utf8)this.chavePix : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.dataExpiracaoAssinatura = null;
      } else {
        this.dataExpiracaoAssinatura = in.readString(this.dataExpiracaoAssinatura instanceof Utf8 ? (Utf8)this.dataExpiracaoAssinatura : null);
      }

      this.dataExpiracaoPagamento = in.readString(this.dataExpiracaoPagamento instanceof Utf8 ? (Utf8)this.dataExpiracaoPagamento : null);

      this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);

    } else {
      for (int i = 0; i < 8; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readLong();
          break;

        case 1:
          this.usuarioId = in.readString(this.usuarioId instanceof Utf8 ? (Utf8)this.usuarioId : null);
          break;

        case 2:
          this.paymentId = in.readString(this.paymentId instanceof Utf8 ? (Utf8)this.paymentId : null);
          break;

        case 3:
          this.billingType = in.readString(this.billingType instanceof Utf8 ? (Utf8)this.billingType : null);
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.chavePix = null;
          } else {
            this.chavePix = in.readString(this.chavePix instanceof Utf8 ? (Utf8)this.chavePix : null);
          }
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.dataExpiracaoAssinatura = null;
          } else {
            this.dataExpiracaoAssinatura = in.readString(this.dataExpiracaoAssinatura instanceof Utf8 ? (Utf8)this.dataExpiracaoAssinatura : null);
          }
          break;

        case 6:
          this.dataExpiracaoPagamento = in.readString(this.dataExpiracaoPagamento instanceof Utf8 ? (Utf8)this.dataExpiracaoPagamento : null);
          break;

        case 7:
          this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}











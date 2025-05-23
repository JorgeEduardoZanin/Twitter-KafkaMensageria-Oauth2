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
public class PagamentoPixRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4228194551774346665L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PagamentoPixRequest\",\"namespace\":\"project.spring.avro\",\"fields\":[{\"name\":\"identificadorApiPrincipal\",\"type\":{\"type\":\"record\",\"name\":\"IdentificadorApiPrincipalRequest\",\"fields\":[{\"name\":\"identificadorApiPrincipal\",\"type\":\"long\"}]}},{\"name\":\"value\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":10,\"scale\":2}},{\"name\":\"usuario\",\"type\":{\"type\":\"record\",\"name\":\"UsuarioPagamentoRequest\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"nome\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"cpf_cnpj\",\"type\":[\"null\",\"string\"],\"default\":null}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<PagamentoPixRequest> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PagamentoPixRequest> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<PagamentoPixRequest> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<PagamentoPixRequest> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<PagamentoPixRequest> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this PagamentoPixRequest to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a PagamentoPixRequest from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a PagamentoPixRequest instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static PagamentoPixRequest fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private project.spring.avro.IdentificadorApiPrincipalRequest identificadorApiPrincipal;
  private java.nio.ByteBuffer value;
  private project.spring.avro.UsuarioPagamentoRequest usuario;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PagamentoPixRequest() {}

  /**
   * All-args constructor.
   * @param identificadorApiPrincipal The new value for identificadorApiPrincipal
   * @param value The new value for value
   * @param usuario The new value for usuario
   */
  public PagamentoPixRequest(project.spring.avro.IdentificadorApiPrincipalRequest identificadorApiPrincipal, java.nio.ByteBuffer value, project.spring.avro.UsuarioPagamentoRequest usuario) {
    this.identificadorApiPrincipal = identificadorApiPrincipal;
    this.value = value;
    this.usuario = usuario;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return identificadorApiPrincipal;
    case 1: return value;
    case 2: return usuario;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: identificadorApiPrincipal = (project.spring.avro.IdentificadorApiPrincipalRequest)value$; break;
    case 1: value = (java.nio.ByteBuffer)value$; break;
    case 2: usuario = (project.spring.avro.UsuarioPagamentoRequest)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'identificadorApiPrincipal' field.
   * @return The value of the 'identificadorApiPrincipal' field.
   */
  public project.spring.avro.IdentificadorApiPrincipalRequest getIdentificadorApiPrincipal() {
    return identificadorApiPrincipal;
  }


  /**
   * Sets the value of the 'identificadorApiPrincipal' field.
   * @param value the value to set.
   */
  public void setIdentificadorApiPrincipal(project.spring.avro.IdentificadorApiPrincipalRequest value) {
    this.identificadorApiPrincipal = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public java.nio.ByteBuffer getValue() {
    return value;
  }


  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.nio.ByteBuffer value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'usuario' field.
   * @return The value of the 'usuario' field.
   */
  public project.spring.avro.UsuarioPagamentoRequest getUsuario() {
    return usuario;
  }


  /**
   * Sets the value of the 'usuario' field.
   * @param value the value to set.
   */
  public void setUsuario(project.spring.avro.UsuarioPagamentoRequest value) {
    this.usuario = value;
  }

  /**
   * Creates a new PagamentoPixRequest RecordBuilder.
   * @return A new PagamentoPixRequest RecordBuilder
   */
  public static project.spring.avro.PagamentoPixRequest.Builder newBuilder() {
    return new project.spring.avro.PagamentoPixRequest.Builder();
  }

  /**
   * Creates a new PagamentoPixRequest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PagamentoPixRequest RecordBuilder
   */
  public static project.spring.avro.PagamentoPixRequest.Builder newBuilder(project.spring.avro.PagamentoPixRequest.Builder other) {
    if (other == null) {
      return new project.spring.avro.PagamentoPixRequest.Builder();
    } else {
      return new project.spring.avro.PagamentoPixRequest.Builder(other);
    }
  }

  /**
   * Creates a new PagamentoPixRequest RecordBuilder by copying an existing PagamentoPixRequest instance.
   * @param other The existing instance to copy.
   * @return A new PagamentoPixRequest RecordBuilder
   */
  public static project.spring.avro.PagamentoPixRequest.Builder newBuilder(project.spring.avro.PagamentoPixRequest other) {
    if (other == null) {
      return new project.spring.avro.PagamentoPixRequest.Builder();
    } else {
      return new project.spring.avro.PagamentoPixRequest.Builder(other);
    }
  }

  /**
   * RecordBuilder for PagamentoPixRequest instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PagamentoPixRequest>
    implements org.apache.avro.data.RecordBuilder<PagamentoPixRequest> {

    private project.spring.avro.IdentificadorApiPrincipalRequest identificadorApiPrincipal;
    private project.spring.avro.IdentificadorApiPrincipalRequest.Builder identificadorApiPrincipalBuilder;
    private java.nio.ByteBuffer value;
    private project.spring.avro.UsuarioPagamentoRequest usuario;
    private project.spring.avro.UsuarioPagamentoRequest.Builder usuarioBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(project.spring.avro.PagamentoPixRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.identificadorApiPrincipal)) {
        this.identificadorApiPrincipal = data().deepCopy(fields()[0].schema(), other.identificadorApiPrincipal);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasIdentificadorApiPrincipalBuilder()) {
        this.identificadorApiPrincipalBuilder = project.spring.avro.IdentificadorApiPrincipalRequest.newBuilder(other.getIdentificadorApiPrincipalBuilder());
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.usuario)) {
        this.usuario = data().deepCopy(fields()[2].schema(), other.usuario);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasUsuarioBuilder()) {
        this.usuarioBuilder = project.spring.avro.UsuarioPagamentoRequest.newBuilder(other.getUsuarioBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing PagamentoPixRequest instance
     * @param other The existing instance to copy.
     */
    private Builder(project.spring.avro.PagamentoPixRequest other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.identificadorApiPrincipal)) {
        this.identificadorApiPrincipal = data().deepCopy(fields()[0].schema(), other.identificadorApiPrincipal);
        fieldSetFlags()[0] = true;
      }
      this.identificadorApiPrincipalBuilder = null;
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.usuario)) {
        this.usuario = data().deepCopy(fields()[2].schema(), other.usuario);
        fieldSetFlags()[2] = true;
      }
      this.usuarioBuilder = null;
    }

    /**
      * Gets the value of the 'identificadorApiPrincipal' field.
      * @return The value.
      */
    public project.spring.avro.IdentificadorApiPrincipalRequest getIdentificadorApiPrincipal() {
      return identificadorApiPrincipal;
    }


    /**
      * Sets the value of the 'identificadorApiPrincipal' field.
      * @param value The value of 'identificadorApiPrincipal'.
      * @return This builder.
      */
    public project.spring.avro.PagamentoPixRequest.Builder setIdentificadorApiPrincipal(project.spring.avro.IdentificadorApiPrincipalRequest value) {
      validate(fields()[0], value);
      this.identificadorApiPrincipalBuilder = null;
      this.identificadorApiPrincipal = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'identificadorApiPrincipal' field has been set.
      * @return True if the 'identificadorApiPrincipal' field has been set, false otherwise.
      */
    public boolean hasIdentificadorApiPrincipal() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'identificadorApiPrincipal' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public project.spring.avro.IdentificadorApiPrincipalRequest.Builder getIdentificadorApiPrincipalBuilder() {
      if (identificadorApiPrincipalBuilder == null) {
        if (hasIdentificadorApiPrincipal()) {
          setIdentificadorApiPrincipalBuilder(project.spring.avro.IdentificadorApiPrincipalRequest.newBuilder(identificadorApiPrincipal));
        } else {
          setIdentificadorApiPrincipalBuilder(project.spring.avro.IdentificadorApiPrincipalRequest.newBuilder());
        }
      }
      return identificadorApiPrincipalBuilder;
    }

    /**
     * Sets the Builder instance for the 'identificadorApiPrincipal' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public project.spring.avro.PagamentoPixRequest.Builder setIdentificadorApiPrincipalBuilder(project.spring.avro.IdentificadorApiPrincipalRequest.Builder value) {
      clearIdentificadorApiPrincipal();
      identificadorApiPrincipalBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'identificadorApiPrincipal' field has an active Builder instance
     * @return True if the 'identificadorApiPrincipal' field has an active Builder instance
     */
    public boolean hasIdentificadorApiPrincipalBuilder() {
      return identificadorApiPrincipalBuilder != null;
    }

    /**
      * Clears the value of the 'identificadorApiPrincipal' field.
      * @return This builder.
      */
    public project.spring.avro.PagamentoPixRequest.Builder clearIdentificadorApiPrincipal() {
      identificadorApiPrincipal = null;
      identificadorApiPrincipalBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getValue() {
      return value;
    }


    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public project.spring.avro.PagamentoPixRequest.Builder setValue(java.nio.ByteBuffer value) {
      validate(fields()[1], value);
      this.value = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public project.spring.avro.PagamentoPixRequest.Builder clearValue() {
      value = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'usuario' field.
      * @return The value.
      */
    public project.spring.avro.UsuarioPagamentoRequest getUsuario() {
      return usuario;
    }


    /**
      * Sets the value of the 'usuario' field.
      * @param value The value of 'usuario'.
      * @return This builder.
      */
    public project.spring.avro.PagamentoPixRequest.Builder setUsuario(project.spring.avro.UsuarioPagamentoRequest value) {
      validate(fields()[2], value);
      this.usuarioBuilder = null;
      this.usuario = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'usuario' field has been set.
      * @return True if the 'usuario' field has been set, false otherwise.
      */
    public boolean hasUsuario() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'usuario' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public project.spring.avro.UsuarioPagamentoRequest.Builder getUsuarioBuilder() {
      if (usuarioBuilder == null) {
        if (hasUsuario()) {
          setUsuarioBuilder(project.spring.avro.UsuarioPagamentoRequest.newBuilder(usuario));
        } else {
          setUsuarioBuilder(project.spring.avro.UsuarioPagamentoRequest.newBuilder());
        }
      }
      return usuarioBuilder;
    }

    /**
     * Sets the Builder instance for the 'usuario' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public project.spring.avro.PagamentoPixRequest.Builder setUsuarioBuilder(project.spring.avro.UsuarioPagamentoRequest.Builder value) {
      clearUsuario();
      usuarioBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'usuario' field has an active Builder instance
     * @return True if the 'usuario' field has an active Builder instance
     */
    public boolean hasUsuarioBuilder() {
      return usuarioBuilder != null;
    }

    /**
      * Clears the value of the 'usuario' field.
      * @return This builder.
      */
    public project.spring.avro.PagamentoPixRequest.Builder clearUsuario() {
      usuario = null;
      usuarioBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PagamentoPixRequest build() {
      try {
        PagamentoPixRequest record = new PagamentoPixRequest();
        if (identificadorApiPrincipalBuilder != null) {
          try {
            record.identificadorApiPrincipal = this.identificadorApiPrincipalBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("identificadorApiPrincipal"));
            throw e;
          }
        } else {
          record.identificadorApiPrincipal = fieldSetFlags()[0] ? this.identificadorApiPrincipal : (project.spring.avro.IdentificadorApiPrincipalRequest) defaultValue(fields()[0]);
        }
        record.value = fieldSetFlags()[1] ? this.value : (java.nio.ByteBuffer) defaultValue(fields()[1]);
        if (usuarioBuilder != null) {
          try {
            record.usuario = this.usuarioBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("usuario"));
            throw e;
          }
        } else {
          record.usuario = fieldSetFlags()[2] ? this.usuario : (project.spring.avro.UsuarioPagamentoRequest) defaultValue(fields()[2]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PagamentoPixRequest>
    WRITER$ = (org.apache.avro.io.DatumWriter<PagamentoPixRequest>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PagamentoPixRequest>
    READER$ = (org.apache.avro.io.DatumReader<PagamentoPixRequest>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}











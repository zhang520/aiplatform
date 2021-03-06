// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Image/ImageMedia.proto

package com.xuanwu.xtion.grpc.message.image;

public final class ImageMediaProto {
  private ImageMediaProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ImageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Image)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string imageName = 1;</code>
     */
    String getImageName();
    /**
     * <code>string imageName = 1;</code>
     */
    com.google.protobuf.ByteString
        getImageNameBytes();

    /**
     * <code>string imageUrl = 2;</code>
     */
    String getImageUrl();
    /**
     * <code>string imageUrl = 2;</code>
     */
    com.google.protobuf.ByteString
        getImageUrlBytes();

    /**
     * <code>bytes imageBytes = 3;</code>
     */
    com.google.protobuf.ByteString getImageBytes();
  }
  /**
   * Protobuf type {@code Image}
   */
  public  static final class Image extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Image)
      ImageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Image.newBuilder() to construct.
    private Image(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Image() {
      imageName_ = "";
      imageUrl_ = "";
      imageBytes_ = com.google.protobuf.ByteString.EMPTY;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Image(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              String s = input.readStringRequireUtf8();

              imageName_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              imageUrl_ = s;
              break;
            }
            case 26: {

              imageBytes_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ImageMediaProto.internal_static_Image_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ImageMediaProto.internal_static_Image_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ImageMediaProto.Image.class, ImageMediaProto.Image.Builder.class);
    }

    public static final int IMAGENAME_FIELD_NUMBER = 1;
    private volatile Object imageName_;
    /**
     * <code>string imageName = 1;</code>
     */
    public String getImageName() {
      Object ref = imageName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        imageName_ = s;
        return s;
      }
    }
    /**
     * <code>string imageName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getImageNameBytes() {
      Object ref = imageName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        imageName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IMAGEURL_FIELD_NUMBER = 2;
    private volatile Object imageUrl_;
    /**
     * <code>string imageUrl = 2;</code>
     */
    public String getImageUrl() {
      Object ref = imageUrl_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        imageUrl_ = s;
        return s;
      }
    }
    /**
     * <code>string imageUrl = 2;</code>
     */
    public com.google.protobuf.ByteString
        getImageUrlBytes() {
      Object ref = imageUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        imageUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IMAGEBYTES_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString imageBytes_;
    /**
     * <code>bytes imageBytes = 3;</code>
     */
    public com.google.protobuf.ByteString getImageBytes() {
      return imageBytes_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getImageNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, imageName_);
      }
      if (!getImageUrlBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, imageUrl_);
      }
      if (!imageBytes_.isEmpty()) {
        output.writeBytes(3, imageBytes_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getImageNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, imageName_);
      }
      if (!getImageUrlBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, imageUrl_);
      }
      if (!imageBytes_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, imageBytes_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ImageMediaProto.Image)) {
        return super.equals(obj);
      }
      ImageMediaProto.Image other = (ImageMediaProto.Image) obj;

      boolean result = true;
      result = result && getImageName()
          .equals(other.getImageName());
      result = result && getImageUrl()
          .equals(other.getImageUrl());
      result = result && getImageBytes()
          .equals(other.getImageBytes());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + IMAGENAME_FIELD_NUMBER;
      hash = (53 * hash) + getImageName().hashCode();
      hash = (37 * hash) + IMAGEURL_FIELD_NUMBER;
      hash = (53 * hash) + getImageUrl().hashCode();
      hash = (37 * hash) + IMAGEBYTES_FIELD_NUMBER;
      hash = (53 * hash) + getImageBytes().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ImageMediaProto.Image parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ImageMediaProto.Image parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ImageMediaProto.Image parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ImageMediaProto.Image parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ImageMediaProto.Image parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ImageMediaProto.Image parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ImageMediaProto.Image parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ImageMediaProto.Image parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ImageMediaProto.Image parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ImageMediaProto.Image parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ImageMediaProto.Image parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ImageMediaProto.Image parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ImageMediaProto.Image prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Image}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Image)
        ImageMediaProto.ImageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ImageMediaProto.internal_static_Image_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ImageMediaProto.internal_static_Image_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ImageMediaProto.Image.class, ImageMediaProto.Image.Builder.class);
      }

      // Construct using com.xuanwu.xtion.grpc.message.image.ImageMediaProto.Image.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        imageName_ = "";

        imageUrl_ = "";

        imageBytes_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ImageMediaProto.internal_static_Image_descriptor;
      }

      public ImageMediaProto.Image getDefaultInstanceForType() {
        return ImageMediaProto.Image.getDefaultInstance();
      }

      public ImageMediaProto.Image build() {
        ImageMediaProto.Image result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ImageMediaProto.Image buildPartial() {
        ImageMediaProto.Image result = new ImageMediaProto.Image(this);
        result.imageName_ = imageName_;
        result.imageUrl_ = imageUrl_;
        result.imageBytes_ = imageBytes_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ImageMediaProto.Image) {
          return mergeFrom((ImageMediaProto.Image)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ImageMediaProto.Image other) {
        if (other == ImageMediaProto.Image.getDefaultInstance()) return this;
        if (!other.getImageName().isEmpty()) {
          imageName_ = other.imageName_;
          onChanged();
        }
        if (!other.getImageUrl().isEmpty()) {
          imageUrl_ = other.imageUrl_;
          onChanged();
        }
        if (other.getImageBytes() != com.google.protobuf.ByteString.EMPTY) {
          setImageBytes(other.getImageBytes());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ImageMediaProto.Image parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ImageMediaProto.Image) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object imageName_ = "";
      /**
       * <code>string imageName = 1;</code>
       */
      public String getImageName() {
        Object ref = imageName_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          imageName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string imageName = 1;</code>
       */
      public com.google.protobuf.ByteString
          getImageNameBytes() {
        Object ref = imageName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          imageName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string imageName = 1;</code>
       */
      public Builder setImageName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        imageName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string imageName = 1;</code>
       */
      public Builder clearImageName() {

        imageName_ = getDefaultInstance().getImageName();
        onChanged();
        return this;
      }
      /**
       * <code>string imageName = 1;</code>
       */
      public Builder setImageNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        imageName_ = value;
        onChanged();
        return this;
      }

      private Object imageUrl_ = "";
      /**
       * <code>string imageUrl = 2;</code>
       */
      public String getImageUrl() {
        Object ref = imageUrl_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          imageUrl_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string imageUrl = 2;</code>
       */
      public com.google.protobuf.ByteString
          getImageUrlBytes() {
        Object ref = imageUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          imageUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string imageUrl = 2;</code>
       */
      public Builder setImageUrl(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        imageUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string imageUrl = 2;</code>
       */
      public Builder clearImageUrl() {

        imageUrl_ = getDefaultInstance().getImageUrl();
        onChanged();
        return this;
      }
      /**
       * <code>string imageUrl = 2;</code>
       */
      public Builder setImageUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        imageUrl_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString imageBytes_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes imageBytes = 3;</code>
       */
      public com.google.protobuf.ByteString getImageBytes() {
        return imageBytes_;
      }
      /**
       * <code>bytes imageBytes = 3;</code>
       */
      public Builder setImageBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }

        imageBytes_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes imageBytes = 3;</code>
       */
      public Builder clearImageBytes() {

        imageBytes_ = getDefaultInstance().getImageBytes();
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Image)
    }

    // @@protoc_insertion_point(class_scope:Image)
    private static final ImageMediaProto.Image DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ImageMediaProto.Image();
    }

    public static ImageMediaProto.Image getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Image>
        PARSER = new com.google.protobuf.AbstractParser<Image>() {
      public Image parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Image(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Image> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Image> getParserForType() {
      return PARSER;
    }

    public ImageMediaProto.Image getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Image_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\026Image/ImageMedia.proto\"@\n\005Image\022\021\n\tima" +
      "geName\030\001 \001(\t\022\020\n\010imageUrl\030\002 \001(\t\022\022\n\nimageB" +
      "ytes\030\003 \001(\014B6\n#com.xuanwu.xtion.grpc.mess" +
      "age.imageB\017ImageMediaProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Image_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Image_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Image_descriptor,
        new String[] { "ImageName", "ImageUrl", "ImageBytes", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

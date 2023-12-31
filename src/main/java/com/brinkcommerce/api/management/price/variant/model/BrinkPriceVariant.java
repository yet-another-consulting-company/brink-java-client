package com.brinkcommerce.api.management.price.variant.model;


public record BrinkPriceVariant(
    Long basePriceAmount,
    Long salePriceAmount,
    Long referencePriceAmount
    ) {


  private BrinkPriceVariant(final BrinkPriceVariantBuilder builder) {
    this(
        builder.basePriceAmount,
        builder.salePriceAmount,
        builder.referencePriceAmount
        );
  }

  public static BrinkPriceVariantBuilder builder() {
    return new BrinkPriceVariantBuilder();
  }

  public static class BrinkPriceVariantBuilder {

    private Long basePriceAmount;
    private Long salePriceAmount;
    private Long referencePriceAmount;

    public BrinkPriceVariantBuilder() {
    }

    public BrinkPriceVariantBuilder withBasePriceAmount(final Long basePriceAmount) {
      this.basePriceAmount = basePriceAmount;
      return this;
    }

    public BrinkPriceVariantBuilder withSalePriceAmount(final long salePriceAmount) {
      this.salePriceAmount = salePriceAmount;
      return this;
    }

    public BrinkPriceVariantBuilder withReferencePriceAmount(
        final Long referencePriceAmount) {
      this.referencePriceAmount = referencePriceAmount;
      return this;
    }

    public BrinkPriceVariant build() {
      return new BrinkPriceVariant(this);
    }
  }
}

package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    private int decreaseSellIn(Item item) {
        return item.sellIn - 1;
    }

    private int alterQuality(Item item, int factor) {
        int qualityToReturn = item.quality + factor;
        if (qualityToReturn > 50) {
            qualityToReturn = 50;
        }
        if (qualityToReturn < 0) {
            qualityToReturn = 0;
        }
        return qualityToReturn;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie":
                    updateAgedBrie(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updateBackstage(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    updateOthers(item);
                    break;
            }
        }
    }

    private void updateOthers(Item item) {
        item.sellIn = decreaseSellIn(item);
        item.quality = alterQuality(item, item.sellIn < 0 ? -2 : -1);
    }

    private void updateBackstage(Item item) {
        int factor = 1;
        if (item.sellIn < 11) {
            factor++;
            if (item.sellIn < 6) {
                factor++;
            }
        }
        item.sellIn = decreaseSellIn(item);
        if (item.sellIn < 0) {
            item.quality = 0;
        } else {
            item.quality = alterQuality(item, factor);
        }
    }

    private void updateAgedBrie(Item item) {
        item.sellIn = decreaseSellIn(item);
        item.quality = alterQuality(item, item.sellIn < 0 ? 2 : 1);
    }
}

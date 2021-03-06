package com.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest {
    @Test
    public void should_item_update_sellin() {
        assertFoo(2,0,0,1);

    }

    @Test
    public void should_item_update_quality() {
        assertFoo(2,2,1,1);
    }

    @Test
    public void should_item_quality_degrade_twice() {
        assertFoo(0,4,2,-1);
    }

    @Test
    public void quality_is_never_negative() {
        assertFoo(1,0,0,0);
    }

    @Test
    public void quality_is_never_negative_when_sellin_is_zero() {
        assertFoo(0,0,0,-1);
    }

    @Test
    public void quality_is_never_negative_when_sellin_is_zero_but_quality() {
        assertFoo(0,1,0,-1);
    }

    @Test
    public void quality_agedBrie_quality() {
        assertAgedBrie(4,1,2,3);
    }

    @Test
    public void shouldnt_quality_more_than_fifty() {
        assertAgedBrie(0,50,50,-1);
    }

    @Test
    public void shouldnt_quality_more_than_fifty_and_only_adds_one_quality() {
        assertAgedBrie(0,49,50,-1);
    }

    @Test
    public void shouldnt_quality_more_than_fifty_and_only_adds_one_quality_when_expired() {
        assertAgedBrie(-1,47,49,-2);
    }

    @Test
    public void shouldnt_sulfuras_quality_update() {
        assertSulfuras(2,34,34,2);
    }

    @Test
    public void should_increase_quality_on_sellin() {
        assertBackstage(11, 34, 35, 10);
    }

    @Test
    public void should_increase_quality_on_sellin_when_sellin_is_ten() {
        assertBackstage(10, 34, 36, 9);
    }

    @Test
    public void should_increase_quality_on_sellin_when_shellin_minor_ten() {
        assertBackstage(7, 34, 36, 6);
    }

    @Test
    public void should_increase_quality_on_sellin_when_shellin_equals_five() {
        assertBackstage(5, 34, 37, 4);
    }

    @Test
    public void should_increase_quality_on_sellin_when_shellin_minor_five() {
        assertBackstage(2, 34, 37, 1);
    }

    @Test
    public void should_drop_quality_on_sellin_over_date() {
        assertBackstage(0, 45, 0, -1);
    }

    @Test
    public void should_drop_quality_on_sellin_over_date_and_sellin_is_negative() {
        assertBackstage(-1, 45, 0, -2);
    }

    private void assertFoo(int sellIn, int initialQuality, int expectedQuality, int expectedSellIn) {
        assertQualityAndsellIn("foo", sellIn, initialQuality, expectedQuality, expectedSellIn);
    }

    private void assertAgedBrie(int sellIn, int initialQuality, int expectedQuality, int expectedSellIn) {
        assertQualityAndsellIn("Aged Brie", sellIn, initialQuality, expectedQuality, expectedSellIn);
    }

    private void assertSulfuras(int sellIn, int initialQuality, int expectedQuality, int expectedSellIn) {
        assertQualityAndsellIn("Sulfuras, Hand of Ragnaros", sellIn, initialQuality, expectedQuality, expectedSellIn);
    }

    private void assertBackstage(int sellIn, int initialQuality, int expectedQuality, int expectedSellIn) {
        assertQualityAndsellIn("Backstage passes to a TAFKAL80ETC concert", sellIn, initialQuality, expectedQuality, expectedSellIn);
    }

    private void assertQualityAndsellIn(String itemName, int sellIn, int initialQuality, int expectedQuality, int expectedSellIn) {
        Item[] items = getUpdateQuality(itemName, sellIn, initialQuality);
        assertEquals(expectedQuality, items[0].quality);
        assertEquals(expectedSellIn, items[0].sellIn);
    }

    private Item[] createItems(String itemName, int sellIn, int quality) {
        return new Item[] {
            new Item(itemName, sellIn, quality)
        };
    }

    private Item[] getUpdateQuality(String itemName, int sellIn, int quality) {
        GildedRose app = new GildedRose(createItems(itemName, sellIn, quality));
        app.updateQuality();
        return app.items;
    }
}

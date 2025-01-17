package salek664.lucky_charm.perk;

import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.RegistryKey;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class PerkSmithingTemplate extends SmithingTemplateItem {
    public final RegistryKey<AttributeEquipmentPerk> perk;
    public PerkSmithingTemplate(Text appliesToText,
                                Text ingredientsText,
                                Text titleText,
                                Text baseSlotDescriptionText,
                                Text additionsSlotDescriptionText,
                                List<Identifier> emptyBaseSlotTextures,
                                List<Identifier> emptyAdditionsSlotTextures,
                                RegistryKey<AttributeEquipmentPerk> perk,
                                FeatureFlag... requiredFeatures) {
        super(appliesToText, ingredientsText, titleText, baseSlotDescriptionText, additionsSlotDescriptionText, emptyBaseSlotTextures, emptyAdditionsSlotTextures, requiredFeatures);
        this.perk = perk;
    }
}

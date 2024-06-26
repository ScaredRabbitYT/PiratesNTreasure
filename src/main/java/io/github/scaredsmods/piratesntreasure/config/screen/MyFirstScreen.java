package io.github.scaredsmods.piratesntreasure.config.screen;


import io.wispforest.owo.ui.base.BaseOwoScreen;
import io.wispforest.owo.ui.component.Components;
import io.wispforest.owo.ui.container.Containers;
import io.wispforest.owo.ui.container.FlowLayout;
import io.wispforest.owo.ui.core.*;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;

public class MyFirstScreen extends BaseOwoScreen<FlowLayout> {

    @Override
    protected @NotNull OwoUIAdapter<FlowLayout> createAdapter() {
        return OwoUIAdapter.create(this, Containers::verticalFlow);
    }

    @Override
        protected void build(FlowLayout rootComponent) {
            rootComponent
                    .surface(Surface.VANILLA_TRANSLUCENT)
                    .horizontalAlignment(HorizontalAlignment.CENTER)
                    .verticalAlignment(VerticalAlignment.CENTER);

            rootComponent.child(
                    Containers.verticalFlow(Sizing.content() /**/, Sizing.content())
                            .child(Components.button(Text.literal("WIP"), button -> {
                                System.out.println("This screen is a WIP");
                            }))
                            .padding(Insets.of(10)) //
                            .surface(Surface.DARK_PANEL)
                            .verticalAlignment(VerticalAlignment.CENTER)
                            .horizontalAlignment(HorizontalAlignment.CENTER)
            );
        }

}
